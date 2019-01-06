package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack1.admin_verification;

public final class admin_005fverification_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOC\n");
      out.write("<head>\n");
      out.write("<title>Retailer Request Page</title>\n");
      out.write("</<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>MedHub Homepage</title>\n");
      out.write("\t\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Arimo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"js/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel-panels.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-desktop.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie/v8.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"css/ie/v9.css\" /><![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div class=\"container\"> \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"#\">MedHub</a></h1>\n");
      out.write("\t\t\t\t\t<span>Ultimate spot for cost effective medicines</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Nav -->\n");
      out.write("\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index_1.html\">Homepage</a></li>\n");
      out.write("                                                <li><a href=\"Search.html\">Search Substitute</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ContactUs.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"UploadData.html\">Upload Data</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Login.jsp.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t<div id=\"main\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\"> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"8u skel-cell-important\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section>\n");
      out.write("    \n");
      out.write(" ");
  
    admin_verification a=new admin_verification();
    //String MedName=request.get
   ResultSet rs=a.viewreq();
    while(rs.next())
    
 {    
      out.write("\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">DD number: ");
      out.print((rs.getString(1)));
      out.write("</p>\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">Retailer name: ");
      out.print((rs.getString(2)));
      out.write("</p>\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">Adress:");
      out.print((rs.getString(3)));
      out.write("</p>\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">Phone no: ");
      out.print((rs.getString(4)));
      out.write("</p>\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">Email: ");
      out.print((rs.getString(5)));
      out.write("</p>\n");
      out.write("<p align=\"center\"><font face=\"Arial\" size=\"4\"><font color=\"black\">Approval: ");
      out.print((rs.getString(6)));
      out.write("</p> \n");
      out.write("<p><a href=\"SetTrue.jsp\"><font color=\"blue\" size=\"5\">Approve It</a>   </p> \n");
      out.write("   \n");
      out.write(" \n");
      out.write("\n");
      out.write("    \n");
      out.write("  ");
 }
      out.write(" \n");
      out.write("   \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
