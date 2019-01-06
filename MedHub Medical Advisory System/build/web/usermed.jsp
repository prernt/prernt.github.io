
<%@page import="java.sql.ResultSet"%>
<%@page import="pack1.admin"%>
<!DOCTYPE html>
<html>
	<head>
		<title> MedHub</title>
                
			<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href='http://fonts.googleapis.com/css?family=Arimo:400,700' rel='stylesheet' type='text/css'>
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-panels.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-desktop.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
	</head>
        
        
    

	<body>		<!-- Header -->
		<div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div>
				
				<!-- Nav -->
				<nav id="nav">
					<ul>
						<li><a href="user.jsp">Homepage</a></li>
                                                <li class="active"><a href="user_search.html">Search Substitute</a></li>
						<li><a href="user_contactus.html">Contact Us</a></li>
						
                                                <li><a href="changepassword.html">Change Password</a></li>
						<li><a href="logout.html">Logout</a></li>
					</ul>
				
			
    <% 
    admin a=new admin();
    String MedName=request.getParameter("T1");
    ResultSet rs=a.viewreq(MedName);
    
    
  if(rs.next())
  {
 while(rs.next())
     
 {    %>
 <table border="25" align="center" cellpadding="10" cellspacing="10"> 
     <tr>
         <td><font face="Arial" size="5"><font color="white">Medicine Name</font></td>
         <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(1))%></font></td>
    </tr>
    <tr><td>
 <font face="Arial" size="5"><font color="white">Constituents</font></td> 
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(7))%></font></td> 
    </tr>
    <tr>
        <td>
 <font face="Arial" size="5"><font color="white">Brand</font>
     </td>
     <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(2))%></font></td>
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white">Type</font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(3))%></font></td>
    </tr>
    <tr>
        <td>
            <font face="Arial" size="5"><font color="white">Pack Qty</font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(4))%></font></td>
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white">Price/Unit</font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getDouble(5))%></font></td>
 
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white"> Price</font> </td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getDouble(6))%></font> </td>
    

    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white"> Dosage </p> </font></td>
        <td> <font face="Arial" size="5"><font color="blue"><%=(rs.getString(8))%></font></td>
     <br> <br>
    </tr>
    </table>
     <br>
     
    <% }%>
    <p align='center' vlink='blue'><font face="Arial" size="5"><font color="white">Click BUY to purchase any medicine 
     <br><a href='BuyMeds.html'><b> BUY</b> </a> </font></p>
 <% }
  
  else
  { %>
     <br><br><br>
     <p align="center"> <font face="Arial" size="8"><font color="white">No details found!</font></font></p>
     <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
     
     
     
     <%}
  %>
 
 
 
                                                              
 
   
</header>

</body>
</html>


