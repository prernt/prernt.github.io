 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>   
               
        <% 
        String medicine=request.getParameter("m_name");
         conn c=new conn();
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("delete from medstable where MedName=?");
                    ps.setObject(1,medicine);
//{                   

                    ps.executeUpdate();
                    response.sendRedirect("deletemedicine.jsp");
//}                     
                    
                     %>
       
 
		
                 
          
       <%    
           
        } catch (SQLException ex) {
                   System.out.println("in store"+ex);
        %>
                     <%
        }
                %>
                
   
    </body>
</html>
