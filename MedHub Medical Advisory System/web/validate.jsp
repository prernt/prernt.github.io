

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
            int flag=0;
            String name=null;
            
            conn c=new conn();
             HttpSession sess=request.getSession();
            try
            {
                PreparedStatement ps = c.con.prepareStatement("select * from signuptable" );
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    if(Username.equals(rs.getString(3)) && Password.equals(rs.getString(7)))
                    {
                        
                        if((Username.equals("Prerna")) && (Password.equals("12345")))
                        {
                            flag=1;
                           name= rs.getString(1);
                            //session.setAttribute("s1",Username);
                             break;
                        }
                        else
                        {
                            name=rs.getString(1);
                            flag=2;
                            break;
                        }
                        
                        
                    }
                      
            }
               
                sess.setAttribute("name",name); 
             
                if(flag==1){
                    %>
                    <jsp:include page="logout.html"/>
                    <%
                response.sendRedirect("admin.html");
                }
                else if(flag==2)
                {
                    %>
                    <jsp:include page="logout.html"/>
                    <%
                    //HttpSession s=request.getSession(true);
                    response.sendRedirect("user.jsp");
                }
                else
                response.sendRedirect("Login.html");
            
            %>
            <jsp:include page="index_1.html"/>
            <%
            }
            
            catch(NullPointerException e)
            {
                
            }
        %>
        
    </body>
</html>