<%-- 
    Document   : SetTrue.jsp
    Created on : 14 Apr, 2016, 12:54:31 AM
    Author     : Prerna
--%>



<%@page import="java.sql.Connection"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //String Username=request.getParameter("T1");
            
            boolean flag=false;
            //String dd=null;                    
            int dd=Integer.parseInt(request.getParameter("T1"));
            Connection con=null;
            conn c=new conn();
            try
            {
                    //Statement st=con.createStatement();

               //ResultSet rs=st.executeQuery("select * from r_app_form where DD_no like ?");
               PreparedStatement ps = c.con.prepareStatement("select * from r_app_form where DD_no=?" );
               ps.setObject(1,dd);
               ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    if(rs.getString(4).equals("False"))
                    {
                         flag=true;
                         break;
                        }
 
                }
                if(flag)
                {
             PreparedStatement ps1 = c.con.prepareStatement("update r_app_form set Verify=? where DD_no=?");
                ps1.setObject(1,"True");
                ps1.setObject(2,dd);
                ps1.executeUpdate();
                response.sendRedirect("admin_verification.jsp");
                con.close();
               }
              
                else
                {
                     out.println("Error occurrred");%>
                    <p><a href="admin_verification.jsp"><font color="blue" size="5">Go back..</font></a>   </p>
               <% 
                }
            }
            catch(NullPointerException e)
            {
               
            }
        %>
        
   
    </body>
</html>
