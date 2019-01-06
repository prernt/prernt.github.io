package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>MedHub Homepage</title>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("                <meta name=\"keywords\" content=\"\" /><link href='http://fonts.googleapis.com/css?family=Arimo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"js/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("<script src=\"js/skel.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel-panels.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-desktop.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie/v8.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"css/ie/v9.css\" /><![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body class=\"homepage\">\n");
      out.write("            ");

            String Username=request.getParameter("T1");
            
        
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <h2><a href=\"#\"><font face=\"mono\" size=\"6\" font color=\"#FFFFFF\">WELCOME</font></a></h2>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 \t\n");
      out.write("                 <div class=\"container\"> \n");
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
      out.write("\t\t\t\t<li class=\"active\"><a href=\"admin.html\">Homepage</a></li>\n");
      out.write("                                                <li><a href=\"user_search.html\">Search Substitute</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"user_contactus.html\">Contact Us</a></li>\n");
      out.write("\t\t\n");
      out.write("                                                <li><a href=\"user_changepassword.html\">Change Password</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.html\">Logout</a></li>\n");
      out.write("                                                \n");
      out.write("                                                     \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t<div id=\"main\">\n");
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
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"image full\"><img src=\"images/2.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t<h3><p><strong> Fed up of high drug costs?</strong></p>\n");
      out.write("\t\t\t\t\t\t\t<p><b>We provide you with a solution!</b></p></h3>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Sidebar -->\n");
      out.write("\t\t\t\t\t<div id=\"sidebar\" class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>News Flash</h2>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"style\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<div id=\"featured\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<h2 align='center'>The Problem</h2>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"image full\"><img src=\"images/problem.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t<p>We all are facing a situation out of unawareness that to most of the expensive medicines prescribed to us, there is a cost effective alternative that could soothe our pockets. \n");
      out.write("</p><p>The mission of <strong>MedHub</strong> is to successfully suggest cost effective alternative to your prescription.\n");
      out.write("\n");
      out.write(" </p>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<h2 align='center'>Our Vision</h2>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"image full\"> <img src=\"images/solution.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t<p>We studied several solutions to this problem and chose the best solution as setting up an online pharmacy which will suggest cost-effective medicines and if the user wishes to get them delivered to their home, we will do the same.\n");
      out.write(" </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
