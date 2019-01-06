

<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javaScript">
    function disableBackButton()
    {
        window.history.forward();
      window.history.backward();
    }
    setTimeout("disableBackButton()",0);
    </script>
   
    </head>
    <body onload="disableBackButton();"
          onpageshow="if(event.persisted)disableBackButton();" onunload="">
        
        <%
            String Username=request.getParameter("T1");
            String Password=request.getParameter("T2");
            String name=null;
            boolean flag=false;
            conn c=new conn();
            HttpSession sess=request.getSession();
            //sess.setAttribute("Username",Username);
            //sess.setAttribute(name,"name");
            
            try
            {
                PreparedStatement ps = c.con.prepareStatement("select * from retailer_signup");
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    if(Username.equals(rs.getString(1)) && Password.equals(rs.getString(5)))
                    {
                        name=rs.getString(2);
                        //sess.setAttribute(name,"name");
                        flag=true;
                        break;
                        
                    }
                      
                 }
                
              sess.setAttribute("name",name); 
                if (flag)
                {
                    //sess.setAttribute(name,"name");
                    response.sendRedirect("retailer_panel.jsp");
                }
                else
                    response.sendRedirect("wronglogin.html");
            }
            catch(NullPointerException e)
            {
                
            }
        %>
        
    </body>
</html>