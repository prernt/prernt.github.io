package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pack1.conn;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("         %>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Login.jsp.html", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

               
         String uname=request.getParameter("T1");
        String fb=request.getParameter("Feedback");
        
        conn c=new conn();
    
        PreparedStatement ps;
        try {
                    ps= c.con.prepareStatement("insert into signuptable values (?) where Username='"+uname+"'");
ps.setString(8,fb);
ps.executeUpdate();
out.println("Successfully posted");
                     
                    
                     
      out.write("\n");
      out.write("       \n");
      out.write("           <div id=\"main\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\"> \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"8u skel-cell-important\">\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Welcome to MedHub</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"byline\">Find an alternative to your prescribed medicine!</span>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("                                                    <a href=\"#\" class=\"image full\"><img src=\"images/ADHDpills-560x315.jpg\" width=\"560\" height=\"315\" alt=\"ADHDpills-560x315\"/>\n");
      out.write("                                                    </a>\n");
      out.write("                                                        <br><br><br><h3><strong> Successful </strong>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("                 \n");
      out.write("          \n");
      out.write("       ");
    
           
        } catch (SQLException ex) {
                   System.out.println("in store"+ex);
        
      out.write("\n");
      out.write("                     ");

        }
                
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("           </div>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
