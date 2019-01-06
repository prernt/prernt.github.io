
<%@page import="java.sql.ResultSet"%>
<%@page import="pack1.admin_verification"%>
<!DOC
<head>
<title>Retailer Request Page</title>
</<!DOCTYPE HTML>

<html>
	<head>
            <title>Verification</title>
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
	<body>
		<!-- Header -->
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
						 <li><a href="admin.html">Homepage</a></li>
                                
                                                <li><a href="deletemedicine.jsp">Medicine Details</a></li>
                                                <li><a href="admin_contactus.html">Contact Us</a></li>
                                                <li class="active"><a href="admin_verification.html">Verification</a></li>
                                                <li><a href="deletefeedback.jsp">View Feedbacks</a></li>
                                              
						<li><a href="aLogout.html">Logout</a></li>
					</ul>
				</nav>
			</div>
		</div>
		
		<!-- Main -->
		<div id="main">
			<div class="container">
				<div class="row"> 

					<!-- Content -->
					<div id="content" class="8u skel-cell-important">
				
				<section>
    
 <%  
    admin_verification a=new admin_verification();
   
   
    //String MedName=request.get
   ResultSet rs=a.viewreq();
    while(rs.next())
    
 {   
    
 %>
<p align="center"><font face="Arial" size="4"><font color="black">DD number: <%=(rs.getString(1))%></p>
<p align="center"><font face="Arial" size="4"><font color="black">Retailer name: <%=(rs.getString(2))%></p>
<p align="center"><font face="Arial" size="4"><font color="black">Address:<%=(rs.getString(3))%></p>
<p align="center"><font face="Arial" size="4"><font color="black">Email: <%=(rs.getString(5))%></p>
<p align="center"><font face="Arial" size="4"><font color="black">Approval: <%=(rs.getString(4))%></p> <br> <br>

<%}%>
   
 <p><a href="SetTrue.html"><font color="blue" size="5">Approve Request</a>   </p>

</header>

</body>
</html>



