 
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
        
        
    

		<!-- Header -->
		<div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">MedHub</a></h1>
					<span>Ultimate spot for cost effective medicines</span>
				</div>
        
               
        <% 
        String mname=request.getParameter("T1");
        String brand=request.getParameter("T2");
        String ad=request.getParameter("addr");
        int quant=Integer.parseInt(request.getParameter("T3"));
        double price=0.0;
        double tb=0.0;
        int bn=0;
        int flag=0;
        Connection con=null;
        conn c=new conn();
    
        PreparedStatement ps,ps1;
        //Statement st;
       
        try

            {
                ps= c.con.prepareStatement("select * from medstable where MedName=? and Brand=?");
                ps.setObject(1,mname);
                ps.setObject(2,brand);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next())
                    {
                        flag=1;
                    price=rs.getDouble(6);
                }
                
                tb=quant*price;
                if(flag==1)
                {
        
        %>
        
				
				<!-- Nav -->
				<nav id="nav">
                                            <form method="post" action="">
            <p align="center"><font face="Arial" size="5"><font color="Black">Your Bill Details:</font></font></p>
        <table align="center" cellpadding="20" cellspacing="20"> 
     <tr>
         <td> <font face="Arial" size="5"><font color="Black">Medicine Name </font></font></td>
         <td><font face="Arial" size="5"><font color="blue"><label id="Label1">
                                                  <%=mname%></label></font></font></td>
    </tr>
    <tr><td>
 <font face="Arial" size="5"><font color="Black">Brand</font></font></td> 
        <td><font face="Arial" size="5"><font color="blue"><label id="Label2">
                                                  <%=brand%></label></font></font></td> 
    </tr>
    <tr>
        <td>
<font face="Arial" size="5"><font color="Black">Quantity Ordered</font></font>
     </td>
     <td><font face="Arial" size="5"><font color="blue"><label id="Label3">
                                                  <%=quant%></label></font></font></td>
    </tr>
    <tr>
        <td><font face="Arial" size="5"><font color="Black">Total Bill</font></font></td>
        <td><font face="Arial" size="5"><font color="blue"><label id="Label4">
                                                  Rs.<%=tb%></label></font></font></td>
    </tr>
   
    </table>
    </form>
    <br>
     <a href="BuyMeds.html"><font face="Arial" size="5"><---Go back </font></a>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br>
					
				</nav>
			

    
<%
} 
        else
        {
                %>
                <nav id="nav">
                                            <form method="post" action="">
            <p align="center"><font face="Arial" size="5"><font color="Black">No such medicine of the brand specified is available!</font></font></p>
                                            </form> <br>
                                            <a href="BuyMeds.html"><font face="Arial" size="5"><---Go back </font></a>
                </nav>
            <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
					
 
                
    <%
        }
            }
        catch (SQLException ex) 
   {}
        
                %>
                        </div> </div>     
    </body>
</html>

