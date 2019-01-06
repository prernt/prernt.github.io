
<%@page import="java.sql.ResultSet"%>
<%@page import="pack1.notice"%>
<!DOCTYPE html>
<html>
	<head>
		<title> MedHub Homepage</title>
		
    <% 
    notice a=new notice();
    //String MedName=request.getParameter("T1");
    ResultSet rs=a.viewreq();
    
    
   if(rs.next())
   {
 while(rs.next())
    
 {    
    %>
        <body>
            <div>
                <header>
        <marquee direction="Up" scrolldelay="300">
     <font face="Monotype Corsiva" size="6" color="black"><%=(rs.getString(2))%></font> </marquee>
     <p>
    <br>
    <br>
 
  <% }}
   
   else
   { %>
   <br>
   <br>
   <br>
   <br>
   <br>
   <br>
   
   <p align="center"><font face="Arial" size="5"><font color="white">No such medicine or its details could be fetched!</font></font> </p>
   
   <br>
   <br>
   <br>
   <br>
   <br>
   <br>
   <br>
   <br>

   
   
 
  <br>
  <br>
  <br>
  <% } %>
       
</div>



       
 

 </body>
</html>


