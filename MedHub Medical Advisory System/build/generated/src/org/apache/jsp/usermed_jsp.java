package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack1.admin;

public final class usermed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title> MedHub Homepage</title>\n");
      out.write("                \n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("\t<body>\t\t<!-- Header -->\n");
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
      out.write("                                                \n");
      out.write("                                                <li><a class=\"active\" href=\"Search.html\">Search Substitute</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ContactUs.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"UploadData.html\">Upload Data</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Login.jsp.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("    ");
 
    admin a=new admin();
    String MedName=request.getParameter("T1");
    ResultSet rs=a.viewreq(MedName);
    
    
    
 while(rs.next())
     
 {    
      out.write("\n");
      out.write(" <table border=\"25\" align=\"center\" cellpadding=\"10\" cellspacing=\"10\"> \n");
      out.write("     <tr>\n");
      out.write("         <td> <p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\">Medicine Name</p> </font></td>\n");
      out.write("         <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(1)));
      out.write("</font></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr><td>\n");
      out.write(" <p align=\"center\"> <font face=\"Arial\" size=\"5\"><font color=\"black\">Constituents</p> </font></td> \n");
      out.write("        <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(7)));
      out.write("</font></td> \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write(" <p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\">Brand</p> </font>\n");
      out.write("     </td>\n");
      out.write("     <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(2)));
      out.write("</font></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\">Type</p> </font></td>\n");
      out.write("        <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(3)));
      out.write("</font></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\">Pack Qty</p> </font></td>\n");
      out.write("        <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(4)));
      out.write("</font></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\">Price/Unit</p> </font></td>\n");
      out.write("        <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getDouble(5)));
      out.write("</font></td>\n");
      out.write(" \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\"> Price</p> </font> </td>\n");
      out.write("        <td><font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getDouble(6)));
      out.write("</font> </td>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p align=\"center\"><font face=\"Arial\" size=\"5\"><font color=\"black\"> Dosage </p> </font></td>\n");
      out.write("        <td> <font face=\"Arial\" size=\"5\"><font color=\"blue\">");
      out.print((rs.getString(8)));
      out.write("</font></td>\n");
      out.write("     <br> <br>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"2\">Click BUY to purchase any medicine <a href='BuyMeds.html'><font face=\"Arial\" size=\"6\"><font color=\"blue\"><b> BUY</b></font></a>\n");
      out.write("                                                              </td>                       \n");
      out.write("    </tr>\n");
      out.write(" \n");
      out.write("  ");
 }
      out.write("\n");
      out.write(" </table>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
