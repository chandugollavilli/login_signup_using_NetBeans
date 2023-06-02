package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Sign up</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(".container {\n");
      out.write("    width: 300px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding-top: 100px;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("    margin-top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" input[type=\"submit\"]{\n");
      out.write("            border: none;\n");
      out.write("            background-color:green;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h1>Sign up</h1>\n");
      out.write("    <form action=\"signupdata.jsp\" method=\"POST\">\n");
      out.write("      <label for=\"username\">Username:</label>\n");
      out.write("      <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("      \n");
      out.write("      <label for=\"password\">Email:</label>\n");
      out.write("      <input type=\"text\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("      <label for=\"password\">Password:</label>\n");
      out.write("      <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("      <input type=\"submit\" value=\"Sign up\">\n");
      out.write("    </form>\n");
      out.write("    <p>Already have an account? <a href=\"login.jsp\">Login</a></p>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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
