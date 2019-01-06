
<%@page import="java.sql.Connection"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>

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
            
    		<div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div> <!-- Nav -->
				<nav id="nav">
                                           
                                                
<% 
    String userid = request.getParameter("T1");
    String pwd=request.getParameter("T2");
    String Newpass=request.getParameter("T3");
    String conpass=request.getParameter("T4");

Connection con=null;
conn c=new conn();
String pass="";
String name="";



//Class.forName("com.mysql.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
PreparedStatement ps,ps1;
        try {
                    ps= c.con.prepareStatement("select * from retailer_signup where ShopId like ?");
                    ps.setObject(1,userid);
                    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    pass=rs.getString(5);
    }
    
    
    if(pwd.equals(pass))
    
    
    {
    ps1= c.con.prepareStatement("update retailer_signup set R_password=? where ShopId=?");
    ps1.setObject(1,Newpass);
    ps1.setObject(2,userid);
//ps1.executeUpdate("update signuptable set Password='"+Newpass+"'");
    ps1.executeUpdate(); %>
    
    <p align="center"><font size="6" face="Arial" color="white">
    
        <% out.println("PASSWORD SUCCESSFULLY CHANGED");
        con.close();
   }    
    else { %>
    </font>
        </p>
    <p align="center"><font size="6" face="Arial" color="white">
        
        
        
        <% out.println("OLD PASSWORD DOESNOT MATCH OR INCORRECT ID");

 %>
        </font>
        </p>

   <%
}
        }
    
 catch(NullPointerException e){

}
%>
<a href="retailer_panel.jsp"><font size="6" face="Arial" color="white">
     <-- Go back </font></a>
 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                        </nav>
                         </div></div>
 


        </body>
</html>