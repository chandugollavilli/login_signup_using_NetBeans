package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class signupdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    String DB_USER = "postgres";
    String DB_PASSWORD = "1234";
    
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Signup Data</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    Connection conn = null;
    Statement stmt = null;

    try {
        // Establish database connection
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        
        // Execute query to insert user data into the database
        String query = "INSERT INTO logsign (username, email, password) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, email);
        pstmt.setString(3, password);
        pstmt.executeUpdate();
        
        // Signup successful, redirect to login page
        response.sendRedirect("login.jsp");
    } catch (Exception e) {
        e.printStackTrace();
        // Signup failed, display error message
        out.println("<h3>Signup Failed. Please try again.</h3>");
    } finally {
        // Close database resources
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
      out.write("\n");
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
