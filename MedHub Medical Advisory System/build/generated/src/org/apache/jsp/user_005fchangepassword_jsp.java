package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class user_005fchangepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');



String userid = request.getParameter("T1");
String pwd=request.getParameter("T2");
String Newpass=request.getParameter("T3");
String conpass=request.getParameter("T4");

Connection con=null;
String pass="";
String name="";
try{
//Class.forName("com.mysql.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from signuptable where Username='" + userid + "'");
if(rs.next())
{

pass=rs.getString("Password");
}

if(pwd.equals(pass)){
Statement st1=con.createStatement();
int i=st1.executeUpdate("update signuptable set Password='"+Newpass+"'");
out.println("Password changed successfully");
st1.close();
con.close();
}
else{
out.println("Old Password doesn't match");
}
}
catch(NullPointerException e){
out.println(e);
}

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
