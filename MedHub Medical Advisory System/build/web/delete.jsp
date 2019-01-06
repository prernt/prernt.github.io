 
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
        int no=Integer.parseInt(request.getParameter("T1"));
        //String tip=request.getParameter("T2");
         conn c=new conn();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("delete from healthtips where S_no=?");
                    ps.setObject(1,no);
                    //ResultSet rs = ps.executeUpdate();
                    ps.executeUpdate();
                    response.sendRedirect("edittips.jsp");
                     
                    
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

