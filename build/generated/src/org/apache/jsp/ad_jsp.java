package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>School Management</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta\n");
      out.write("      name=\"viewport\"\n");
      out.write("      content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("      integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap/admissionstyle.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
 
        
        
        
        try { Class.forName("com.mysql.jdbc.Driver"); Connection
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb", "root",
    "root"); PreparedStatement ps=c.prepareStatement("select * from leadModule");
    
    ResultSet rs=ps.executeQuery(); if(rs.next()) { 
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("      <nav id=\"sidebar\">\n");
      out.write("        <div class=\"custom-menu\">\n");
      out.write("          <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("            <span class=\"sr-only\">Toggle Menu</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"p-4\">\n");
      out.write("          <h1>\n");
      out.write("            <a href=\"index.html\" class=\"logo\"\n");
      out.write("              >School Management<span>Administration</span></a\n");
      out.write("            >\n");
      out.write("          </h1>\n");
      out.write("          <ul class=\"list-unstyled components mb-5\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-home mr-3\"></span> Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"http://127.0.0.1:5500/leadenquiry.html#\"\n");
      out.write("                ><span class=\"fa fa-user mr-3\"></span> About</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active\">\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-briefcase mr-3\"></span> Works</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-sticky-note mr-3\"></span> Blog</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-suitcase mr-3\"></span> Gallery</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-cogs mr-3\"></span> Services</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\"\n");
      out.write("                ><span class=\"fa fa-paper-plane mr-3\"></span> Contacts</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <div class=\"mb-5\">\n");
      out.write("            <h3 class=\"h6 mb-3\">Subscribe for newsletter</h3>\n");
      out.write("            <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("              <div class=\"form-group d-flex\">\n");
      out.write("                <div class=\"icon\"><span class=\"icon-paper-plane\"></span></div>\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Enter Email Address\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"footer\">\n");
      out.write("            <p>\n");
      out.write("              Copyright &copy;\n");
      out.write("              <script>\n");
      out.write("                document.write(new Date().getFullYear());\n");
      out.write("              </script>\n");
      out.write("              All rights reserved\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <!-- Page Content  -->\n");
      out.write("\n");
      out.write("      <div id=\"content\" class=\"p-4 p-md-5 pt-5\">\n");
      out.write("        <h2 class=\"mb-4\">Admission Module</h2>\n");
      out.write("        <div\n");
      out.write("          class=\"alert alert-warning alert-dismissible fade show\"\n");
      out.write("          role=\"alert\"\n");
      out.write("        >\n");
      out.write("          <strong>Holy guacamole!</strong> You should check in on some of those\n");
      out.write("          fields below.\n");
      out.write("          <button\n");
      out.write("            type=\"button\"\n");
      out.write("            class=\"close\"\n");
      out.write("            data-dismiss=\"alert\"\n");
      out.write("            aria-label=\"Close\"\n");
      out.write("          >\n");
      out.write("            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <nav aria-label=\"breadcrumb\">\n");
      out.write("          <ol class=\"breadcrumb\">\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"#\">Library</a></li>\n");
      out.write("            <li class=\"breadcrumb-item active\" aria-current=\"page\">\n");
      out.write("              Admission\n");
      out.write("            </li>\n");
      out.write("          </ol>\n");
      out.write("        </nav>\n");
      out.write("        <!--Bootstrap Form starts-->\n");
      out.write("\n");
      out.write("        <!--studentsname and gender starts-->\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("          <div class=\"form-group mb-3\">\n");
      out.write("            <label for=\"referencenumber\" class=\"form-label\"\n");
      out.write("              >Search For Reference ID</label\n");
      out.write("            >\n");
      out.write("            <input\n");
      out.write("              type=\"text\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              id=\"studentsname\"\n");
      out.write("              aria-describedby=\"studentsname\"\n");
      out.write("            />\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <button class=\"btn btn-primary\" type=\"submit\">Button</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("          <!--Standard for starts-->\n");
      out.write("          <div class=\"admission-standard\">\n");
      out.write("            <label for=\"form-select-standard\">Standard </label>\n");
      out.write("\n");
      out.write("            <p class=\"fw-normal\">here comes the standard dynamically</p>\n");
      out.write("          </div>\n");
      out.write("          <!--Standard for ends-->\n");
      out.write("          <!--Generated Admission Number-->\n");
      out.write("          <div class=\"admission-generated-number\">\n");
      out.write("            <label for=\"form-select-generated-number\"\n");
      out.write("              >Generated Admission Number\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("            <p class=\"fw-normal\">here comes the number dynamically</p>\n");
      out.write("          </div>\n");
      out.write("          <!--Generated Admission Number-->\n");
      out.write("          <!--Student's Name-->\n");
      out.write("          <div class=\"admission-studentname\">\n");
      out.write("            <label for=\"form-select-generated-number\">Student's name </label>\n");
      out.write("            <h1>");
      out.print(rs.getString(1));
      out.write("</h1>\n");
      out.write("            ");
 } }catch(Exception e) { System.out.println(e); } 
      out.write("\n");
      out.write("            <p class=\"fw-normal\">here comes the number dynamically</p>\n");
      out.write("          </div>\n");
      out.write("          <!--Student's Name-->\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script\n");
      out.write("      src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("      integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\n");
      out.write("      integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("      integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("  </body>\n");
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
