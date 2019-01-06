
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pack1.conn"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javaScript">
             window.history.forward();
    function disableBackButton()
    {
        window.history.forward();
     // window.history.backward();
    }
  //  setTimeout("disableBackButton()",0);
    </script>
    </head>
    <body onload="disableBackButton();"
          onpageshow="if(event.persisted)disableBackButton();" onunload="">
          
<%
response.sendRedirect("index_1.html");
%>
</body>
 </html>