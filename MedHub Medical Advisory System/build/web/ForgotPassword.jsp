 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
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
		
               
        <% 
        String uname=request.getParameter("T1");
        String sq=request.getParameter("D1");
        String sa=request.getParameter("T2");
        String pass;
        boolean flag= false;
    
        conn c=new conn();
    
        PreparedStatement ps;
        
                                      
            try
            {
                ps= c.con.prepareStatement("select * from signuptable where Username='"+uname+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    if(sq.equals(rs.getString(5)) && sa.equals(rs.getString(6)))
                    {
                        
                        flag= true;
                            break;
                   }
                 }
                if(flag)
                {
%>
				
				<div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div> <!-- Nav -->
				<nav id="nav">
                                            <form method="post" action="">
         
    
         <font face="Arial" size="5"><font color="Black">Your original password is: </font></font>
         <font face="Arial" size="5"><font color="blue"><label id="Label1">
                                                  <%=(rs.getString(7))%></label></font></font>
                        </form>
                       <br><br><font face="Arial" size="5"><a href="index_1.html">Click here to go back.</a></font><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                        </nav>
                         </div></div>
                        
               <% }
               else
                {
               
                %>
      
               <div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div>  <nav id="nav">
                                            <form method="post" action="">
         
    
         
         <font face="Arial" size="5"><font color="blue"><label id="Label1">
                                                  Your entries does not match.</label></font></font>
                        </form> 
                                    <br>
<br><font face="Arial" size="5"><a href="index_1.html">Click here to go back.</a></font><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>  
         
                    </nav>
                        </div>
               </div>
                
                
                
      <%} %>
         
      
                
                
      <%  
            
            }  catch(NullPointerException e)
            {
                
            }
        %>
                      </body>
                        
       
</html>
