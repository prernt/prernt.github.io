package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pack1.notice;
import java.sql.*;
import java.io.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("          \n");
      out.write("    \n");
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
      out.write("\t<body class=\"homepage\">\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"index_1.jsp\">Homepage</a></li>\n");
      out.write("                                                <li><a href=\"Search.html\">Search Substitute</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ContactUs.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"UploadData.html\">Upload Data</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Login.jsp.html\">Login</a></li>\n");
      out.write("                                                \n");
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
      out.write("\t\t\t\t\t\t\t<h3><strong> Fed up of high drug costs?</strong>\n");
      out.write("\t\t\t\t\t\t\t<b>We provide you with a solution!</b></h3>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Sidebar -->\n");
      out.write("\t\t\t\t\t<div id=\"sidebar\" class=\"4u\">\n");
      out.write("                                            <section>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                           ");
 //response.sendRedirect("notice.jsp");
      out.write("\n");
      out.write("                                                                \n");
      out.write("                                                                \n");
      out.write("<table width=100% border=10>\n");
      out.write("\n");
      out.write("<thead>\n");
      out.write("<h2 align=\"center\"><font face=\"Monotype Corsiva\" size=\"6\" color=\"Black\"><b>Health Tips</b></font></h2>\n");
      out.write("</thead>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<marquee direction=\"Up\" scrolldelay=\"300\">\n");
      out.write("*Try sticking with water and milk. Don?t buy juice.<br><br> \n");
      out.write("*Don?t eat while standing.<br><br>\n");
      out.write("*Incorporate more protein into your diet. More protein will help keep you fuller longer.<br><br>\n");
      out.write("*Try eating a salad a day. <br><br>\n");
      out.write("*Try satisfying your sweet tooth with fruit. <br><br>\n");
      out.write("*Switch over to whole wheat flour or white whole wheat flour .<br><br>\n");
      out.write("*Start saying to yourself ?I want to work out? instead of ?I have to workout?.<br><br>\n");
      out.write("*Try dark chocolate instead of milk or semi-sweet.<br><br>\n");
      out.write("*Choose unsalted nuts instead of salted.<br><br>\n");
      out.write("*Try using olive oil instead of vegetable oil.<br><br>\n");
      out.write("*Try coconut oil in place of butter. Try coconut oil in place of butter.<br><br>\n");
      out.write("*Don?t eat dessert every night.<br><br>\n");
      out.write("*Find and try foods higher in fiber.<br><br>\n");
      out.write("*Try to go 1 week without eating sugar.<br><br>\n");
      out.write("*Then try to go 1 week without eating artificial sugar.<br><br>\n");
      out.write("*Watch 30 minutes less of TV each day.<br><br>\n");
      out.write("*Choose one meal per week to splurge.But don?t go all buck-wild.<br><br>\n");
      out.write("*Don?t skip breakfast.<br><br>\n");
      out.write("*Replace brown rice for white.<br><br>\n");
      out.write("*Replace white bread with whole wheat.<br><br>\n");
      out.write("*Try baking instead of frying.<br><br>\n");
      out.write("</font>\n");
      out.write("</marquee>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("                                           \n");
      out.write("</header>\n");
      out.write("                                                 </section>\n");
      out.write("                                            \n");
      out.write("                                            <br>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                           <section>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"style\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                    <img src=\"images/05_meds_250x375.jpg\" width=\"350\" height=\"450\" alt=\"05_meds_250x375\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                </li>\n");
      out.write("                                                </section>\n");
      out.write("\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<div id=\"featured\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<h2 align='center'>The Problem</h2>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"image full\"><img src=\"images/problem.jpg\" width=\"50\" height=\"300\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t<p>We all are facing a situation out of unawareness that to most of the expensive medicines prescribed to us, there is a cost effective alternative that could soothe our pockets. \n");
      out.write("</p><p>The mission of <strong>MedHub</strong> is to successfully suggest cost effective alternative to your prescription.\n");
      out.write("\n");
      out.write(" </p>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<h2 align='center'>Our Vision</h2>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"image full\"> <img src=\"images/solution.jpg\" width=\"50\" height=\"300\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t<p>We studied several solutions to this problem and chose the best solution as setting up an online pharmacy which will suggest cost-effective medicines and if the user wishes to get them delivered to their home, we will do the same.\n");
      out.write(" </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"4u\">\n");
      out.write("\t\t\t\t\t\t<h2 align='center'>Disclaimer</h2>\n");
      out.write("                                                <a href=\"#\" class=\"image full\"><img src=\"images/drugs-medicine.jpg\" width=\"50\" height=\"300\" alt=\"drugs-medicine\"/>\n");
      out.write("                                                </a>\n");
      out.write("\t\t\t\t\t\t<p>The medical information on this site is provided as \n");
      out.write("a information resource only.Do not disregard consulting professionals because of \n");
      out.write("something you have accessed through this website. We are not held responsible \n");
      out.write("thereafter.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        \n");
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
