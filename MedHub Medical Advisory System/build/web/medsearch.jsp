
<%@page import="java.sql.ResultSet"%>
<%@page import="pack1.admin"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Alternate Medicine</title>
                
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
						<li><a href="index_1.html">Homepage</a></li>
                                                <li class="active"><a href="Search.html">Search Substitute</a></li>
						<li><a href="ContactUs.html">Contact Us</a></li>
						<li><a href="UploadData.html">Upload Data</a></li>
						<li><a href="Login.jsp.html">Login</a></li>
                                                <li><a href="feedback.html">Feedback</a></li> 
					</ul>
                      
            
			
    <% 
    admin a=new admin();
    String MedName=request.getParameter("T1");
    ResultSet rs=a.viewreq(MedName);
    
    
   if(rs.next())
   {
 while(rs.next())
    
 {    %>
 <table align="center" cellpadding="20" cellspacing="20"> 
     <tr>
         <td> <font face="Arial" size="5"><font color="white">Medicine Name </font></font></td>
         <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(1))%></font></font></td>
    </tr>
    <tr><td>
 <font face="Arial" size="5"><font color="white">Constituents</font></font></td> 
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(7))%></font></font></td> 
    </tr>
    <tr>
        <td>
<font face="Arial" size="5"><font color="white">Brand </font></font>
     </td>
     <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(2))%></font></font></td>
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white">Type</font></font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(3))%></font></font></td>
    </tr>
    <tr>
        <td>
            <font face="Arial" size="5"><font color="white">Pack Qty </font></font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getString(4))%></font></font> </td>
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white">Price/Unit</font></font></td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getDouble(5))%></font></font></td>
 
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white"> Price</font></font> </td>
        <td><font face="Arial" size="5"><font color="blue"><%=(rs.getDouble(6))%></font> </font></td>
    

    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="white"> Dosage</font></font></td>
        <td> <font face="Arial" size="5"><font color="blue"><%=(rs.getString(8))%></font></font></td>
    </tr>
    
    </table>
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
       <br>
  <br>
  <br>  <br>
  <br>
  <br>  <br>
  <br>
  <br>  <br>
  <br>
  <br>  <br>
  <br>
  <br>  <br>
  <br>
  <br>   </nav>
</div>
</div>
        <p><font color="#FF0000"><font size="2">DISCLAIMER :</font></font><font size="2">
</font><font size="2">**The medical information on this site is provided as 
a information resource only.Do not disregard consulting professionals because of 
something you have accessed through this website. We are not held responsible 
thereafter.</font></p>

       
 

 </body>
</html>


