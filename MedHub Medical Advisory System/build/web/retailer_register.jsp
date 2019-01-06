 
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
        String adr=request.getParameter("S1");
        String id=request.getParameter("T2");
       // int phn=Integer.parseInt(request.getParameter("T3"));
        int dd=Integer.parseInt(request.getParameter("T4"));
        //String v="false";
        conn c=new conn();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("insert into r_app_form values (?,?,?,?,?)");
//if(cpass==pass)
//{ 
                ps.setInt(1,dd);
                ps.setString(2,name); 
                ps.setString(3,adr);
               // ps.setInt(4,phn);
                ps.setString(5,id);
                ps.setString(4,"False");
                ps.executeUpdate();
               // ps.setString(5,"False");
//}                     
                    
                     %>
       
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
                                                    <a href="#" class="image full"><img src="images/ADHDpills-560x315.jpg" width="560" height="315" alt="ADHDpills-560x315"/>
                                                    </a>
                                                    <br><br><br><h3><strong> Your account was successfully created!<br> Please wait for the admin to verify.<br>You can check your status by going back to the earlier page!</strong>
                                                        <a href="retailer.html"><--Go Back </a>
						</section>
					</div>
		
                 
          
       <%    
           
        } 
        
                catch (SQLException ex) {
                   System.out.println("in store"+ex);
                 
        %>
           <div id="content" class="8u skel-cell-important">
						<section>
							<header>
								<h2>Welcome to MedHub</h2>
								<span class="byline">Find an alternative to your prescribed medicine!</span>
							</header>  
                                                    <a href="#" class="image full"><img src="images/ADHDpills-560x315.jpg" width="560" height="315" alt="ADHDpills-560x315"/>
                                                    </a>
                                                        <br><br><br><h3><strong> Some error occurred!  </strong>
							
						</section>
					</div>
           <a href="retailer_register.html"> Register again!</a>
           <%
        }
                %>
                                </div>
                        </div>
           </div>
    </body>
</html>
