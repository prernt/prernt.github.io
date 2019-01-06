 
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
        String name=request.getParameter("T1");
        String adr=request.getParameter("T2");
        String uname=request.getParameter("T3");
        String email=request.getParameter("T4");
        String sq=request.getParameter("D1");
        String sa=request.getParameter("T5");
        String pass=request.getParameter("T6");
      
        conn c=new conn();
         HttpSession sess=request.getSession();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("insert into signuptable values (?,?,?,?,?,?,?)");
                  
ps.setString(1,name); 
ps.setString(2,adr);
ps.setString(3,uname); 
ps.setString(4,email);
ps.setString(5,sq);
ps.setString(6,sa);
ps.setString(7,pass);
ps.executeUpdate();
sess.setAttribute("name",name);
response.sendRedirect("user.jsp");
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
