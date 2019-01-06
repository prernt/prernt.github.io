package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pack1.conn;
import java.sql.ResultSet;
import java.sql.*;

public final class medSearch_html_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Statement stmt=null;
            Statement stmt1=null;
            String MedicineName=request.getParameter("T1");
            String cons;
            String cons1;
            int flag=0;
            conn c=new conn();
            try
            { 
                stmt=c.con.createStatement();
                        
                cons="Select Constituents from medstable where MedName like Aspirin(300 mg)";
               
                ResultSet rs =stmt.executeQuery(cons);
                
                stmt1=c.con.createStatement();
                cons1="Select * from medstable where Constituents=cons";
                ResultSet rs1=stmt1.executeQuery(cons1);
                
                while(rs.next())
                {
                   String MedName=rs1.getString("MedName");
                   String Brand=rs1.getString("Brand");
                   String Type=rs1.getString("Type");
                   int PackQty=rs1.getInt("PackQty");
                   Double PPU=rs1.getDouble("Price/Unit");
                   Double Price=rs1.getDouble("Price");
                   String Dosage=rs1.getString("Dosage");
                   String Constituents=rs1.getString("Constituents");
                  
                   System.out.println("Medicine name:"+MedName);
                }
                rs.close();
            } 
            catch(NullPointerException e)
            {
                
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
