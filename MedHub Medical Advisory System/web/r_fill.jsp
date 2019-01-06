 
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
        String mname=request.getParameter("T1");
        String u=request.getParameter("u");
        String brand=request.getParameter("T2");
        String type=request.getParameter("D1");
        String pck1=request.getParameter("T3");
        String pck2=request.getParameter("D2");
        String price=request.getParameter("T4");
        String pr=request.getParameter("T5");
        String con=request.getParameter("T6");
        String dos1=request.getParameter("D3");
        String dos2=request.getParameter("T7");
        String quant=request.getParameter("T9");
             
        conn c=new conn();
    
        PreparedStatement ps,ps1;
        try {
              ps1= c.con.prepareStatement("insert into storedetail values (?,?,?,?,?)");
                  
            ps1.setString(1,mname); 
            ps1.setString(2,brand);
            ps1.setString(3,pr); 
            ps1.setString(4,quant);
            ps1.setString(5,u);
            ps1.executeUpdate();
      }
        
        catch (SQLException ex) {
                   System.out.println("in store"+ex);
        
      }    
              
        
        
        
        try {
            ps= c.con.prepareStatement("insert into medstable values (?,?,?,?,?,?,?,?)");
                  
ps.setString(1,mname); 
ps.setString(2,brand);
ps.setString(3,type); 
ps.setString(4,pck1+""+pck2);
ps.setString(5,price);
ps.setString(6,pr);
ps.setString(7,con);
ps.setString(8,dos2+""+dos1);
ps.executeUpdate();
        
                  


                    
                     %>   

		
                 
          
       <%    
           
        } catch (SQLException ex) {
                   System.out.println("in store"+ex);
        %>
                     <%
        }
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
                                                        <br><br><br><h3><strong> Entries Updated! </strong>
							<br> <a href="retailer_uploaddata.html">Go back</a>
						</section>
       
        
					</div>
                                </div>
                        </div>
           </div>
   
    </body>
</html>

