
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
        String adr=request.getParameter("t2");
        String sid=request.getParameter("T3");
          String sname=request.getParameter("T2");
        String email=request.getParameter("T4");
        String sq=request.getParameter("D1");
        String sa=request.getParameter("T5");
        //long phone=Integer.parseInt(request.getParameter("T6"));
  
        
        
        String pass=request.getParameter("T7");
       // String cpass=request.getParameter("T7");
        conn c=new conn();
         HttpSession sess=request.getSession();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("insert into retailer_signup values (?,?,?,?,?,?,?,?)");
//if(cpass==pass)
//{                   
ps.setString(1,sid); 
ps.setString(2,name);
ps.setString(3,sname); 
ps.setString(4,email);
ps.setString(5,pass);
ps.setString(6,adr);

ps.setString(7,sq);
ps.setString(8,sa);
ps.executeUpdate();
sess.setAttribute("name",name);
response.sendRedirect("retailer_panel.jsp");
                    
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

