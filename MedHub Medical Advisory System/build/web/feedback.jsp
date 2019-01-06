 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body> 
         %>
                    
                    
                    <%
               
        String uname=request.getParameter("T1");
        String fb=request.getParameter("Feedback");
       // int flag=0;
        
        conn c=new conn();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("insert into feedback values (?,?)");
                    ps.setString(1,uname);
                    ps.setString(2,fb);
                    ps.executeUpdate();
                    response.sendRedirect("feedback1.html");
        
    
   
%>
          
       <%    
           
       } catch (SQLException ex) {
                   System.out.println("in store"+ex);
        
                    
        }
                %>
         
   
    </body>
</html>
