
<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE HTML>

<html>
	<head>
		<title>MedHub Homepage</title>
                
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
                                            <li><a href="admin.html">Homepage</a></li>
                                
                                                <li class="active"><a href="deletemedicine.jsp">Medicine Details</a></li>
                                                <li><a href="admin_contactus.html">Contact Us</a></li>
                                                <li><a href="admin_verification.html">Verification</a></li>
                                                <li><a href="deletefeedback.jsp">View Feedbacks</a></li>
                                                
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
                                    

            

<br>
<br>

 <%
 
            String i=null;
            String str=null;
            conn c=new conn();
            try
            {
                PreparedStatement ps = c.con.prepareStatement("select * from medstable" );
                ResultSet rs = ps.executeQuery();
                out.println("Medicine Name and Their Respective Brand are listed below in order");
                 %>
                    <br><br><br>
                    <%
                while(rs.next())
                {
                    i=rs.getString(1);
                    str=rs.getString(2);
                    
                    out.println(i);
                    %>
                    <br>
                    <%
                    out.println(str);
                    %>
                    <br><br><br>
                    <%
                    out.println("\n");
                 }
                      
            }
                        catch(NullPointerException e)
            {
                
            }
               
                
%>

<!-- Sidebar -->
					<div id="sidebar" class="4u">
						<section>
                                                    <ul class="style">
							<li>
                                                                     <form method="POST" action="delete_medicine.jsp">
<p align="center"><strong><span style="text-transform: capitalize">
        <font face="fantasy" size="5">Medicine name :</font></span></strong> <input type="text" name="m_name" value="" required/></p>

<p align="center"><input type="submit" value="Delete" name="Submit" /></p>
 </form>
                                                                </li>
		
                                                    </ul>
								
                                                </section>
                                        </div></div></div> </div>







                                        
                </div>                                       
                            
</body>
</html>
