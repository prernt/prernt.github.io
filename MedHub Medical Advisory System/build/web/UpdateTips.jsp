
<%@page import="pack1.conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
    
    <form method="post" action="" target="left">
        
        
        
<%
            String str=null;
            conn c=new conn();
            try
            {
                PreparedStatement ps = c.con.prepareStatement("select * from healthtips" );
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    //i=rs.getInt(1);
                    str=rs.getString(2);
                    out.println(str);
                    %>
                    <br>
                    <%
                    out.println("\n");
                 }
                      
            }
                        catch(NullPointerException e)
            {
                
            }
               
                
%>
    </form>
    </body>
</html>

        