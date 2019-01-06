 
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
        int dd=Integer.parseInt(request.getParameter("T1"));
        boolean flag= false;
       // String cpass=request.getParameter("T7");
        conn c=new conn();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("select * from r_app_form where DD_no like ?"); //into signuptable values (?,?,?,?,?,?,?)");
                    ps.setObject(1,dd);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next())
                    {
                    if(rs.getString(4).equals("True"))
                    {
                         flag=true;
                         break;
                    }
                    }
                    
                    if(flag)
                    {
                        response.sendRedirect("retailersignup.html");
                    }
                    else
                    {
                        out.println("");
                    }

//}                     
                    
                     %>
       
           <div id="main">
			<div class="container">
				<div class="row"> 
					
					<!-- Content -->
					<div id="content" class="8u skel-cell-important">
						<section>
							<header>
                                                            <h2>You have either not registered or are still not verified by the Admin! <br> In case you have registered please wait for the admin to verify!  </h2>
								
							</header>
                                                    <a href="#" class="image full"><img src="images/ADHDpills-560x315.jpg" width="560" height="315" alt="ADHDpills-560x315"/>
                                                    </a>
                                                        
						</section>
					</div>
		
                 
          
       <%    
           
        } catch (SQLException ex) {
                   System.out.println("in store"+ex);
        %>
                     <%
        }
                %>
                                </div>
                        </div>
           </div>
   
    </body>
</html>
