<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>User Homepage</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
                <meta name="keywords" content="" /><link href='http://fonts.googleapis.com/css?family=Arimo:400,700' rel='stylesheet' type='text/css'>
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
	
	<body class="homepage">
           

			<!-- Header -->
		<div id="header">
                    
                    <div id="logo">
                        <a href="#"> </a>
                        <font face="mono" size="6" color="#FFFFFF">
                            
                            <% 
                        
                         HttpSession sess=request.getSession(false);
                        
                         out.println("Welcome"); 
                            %> 
                            <br><br>
                         <% 
                                 out.println(sess.getAttribute("name"));
                            
                        %>
                        </font>
                        
                        
                    </div>
                    
                 	
                 <div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div>
				
				<!-- Nav -->
				<nav id="nav">
					<ul>
				<li class="active"><a href="user.jsp">Homepage</a></li>
                                                <li><a href="user_search.html">Search Substitute</a></li>
						<li><a href="user_contactus.html">Contact Us</a></li>
						
                                                <li><a href="changepassword.html">Change Password</a></li>
						<li><a href="logout.html">Logout</a></li>
                                                
                                                
                                                     
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
							<header>
								<h2>Welcome to MedHub</h2>
								<span class="byline">Find an alternative to your prescribed medicine!</span>
							</header>
							<a href="#" class="image full"><img src="images/2.jpg" alt="" /></a>
							<h3><<strong> Fed up of high drug costs?</strong>
							<b>We provide you with a solution!</b></h3>
						</section>
					</div>
	<!-- Sidebar -->
					<div id="sidebar" class="4u">
                                            <section>
						
							<header>
<table width=100% border=10>

<thead>
<h2 align="center"><font face="Monotype Corsiva" size="6" color="Black"><b>Health Tips</b></font></h2>
</thead>

<tr>
<td>
<marquee direction="Up" scrolldelay="300">
    <font face="Monotype Corsiva" size="6" color="black"> 

*Try sticking with water and milk. Don’t buy juice.<br><br> 
*Don’t eat while standing.<br><br>
*Incorporate more protein into your diet. More protein will help keep you fuller longer.<br><br>
*Try eating a salad a day. <br><br>
*Try satisfying your sweet tooth with fruit. <br><br>
*Switch over to whole wheat flour or white whole wheat flour .<br><br>
*Start saying to yourself “I want to work out” instead of “I have to workout”.<br><br>
*Try dark chocolate instead of milk or semi-sweet.<br><br>
*Choose unsalted nuts instead of salted.<br><br>
*Try using olive oil instead of vegetable oil.<br><br>
*Try coconut oil in place of butter. Try coconut oil in place of butter.<br><br>
*Don’t eat dessert every night.<br><br>
*Find and try foods higher in fiber.<br><br>
*Try to go 1 week without eating sugar.<br><br>
*Then try to go 1 week without eating artificial sugar.<br><br>
*Watch 30 minutes less of TV each day.<br><br>
*Choose one meal per week to splurge.But don’t go all buck-wild.<br><br>
*Don’t skip breakfast.<br><br>
*Replace brown rice for white.<br><br>
*Replace white bread with whole wheat.<br><br>
*Try baking instead of frying.<br><br>
</font>
</marquee>
</td>
</tr>

</table>
                                           
</header>
                                                 </section>
                                            
                                            <br>
                                            
                                            
                                           <section>
							
		
							<ul class="style">
								<li>
                                                                    <img src="images/05_meds_250x375.jpg" width="350" height="450" alt="05_meds_250x375"/>



                                                                </li>
                                                </section>

                                               

</div>

		<!-- Footer -->
		<div id="featured">
			<div class="container">
				<div class="row">
					<div class="4u">
						<h2 align='center'>The Problem</h2>
					<a href="#" class="image full"><img src="images/problem.jpg" width="50" height="300" alt="" /></a>
						<p>We all are facing a situation out of unawareness that to most of the expensive medicines prescribed to us, there is a cost effective alternative that could soothe our pockets. 
</p><p>The mission of <strong>MedHub</strong> is to successfully suggest cost effective alternative to your prescription.

 </p>
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp		</div>
					<div class="4u">
						<h2 align='center'>Our Vision</h2>
					<a href="#" class="image full"> <img src="images/solution.jpg" width="50" height="300" alt="" /></a>
						<p>We studied several solutions to this problem and chose the best solution as setting up an online pharmacy which will suggest cost-effective medicines and if the user wishes to get them delivered to their home, we will do the same.
 </p>
                                        </div>
                                        
                                        <div class="4u">
						<h2 align='center'>Disclaimer</h2>
                                                <a href="#" class="image full"><img src="images/drugs-medicine.jpg" width="50" height="300" alt="drugs-medicine"/>
                                                </a>
						<p>The medical information on this site is provided as 
a information resource only.Do not disregard consulting professionals because of 
something you have accessed through this website. We are not held responsible 
thereafter.</p>
					</div>

</div>

</div>

</div>
		
	</body>
</html>