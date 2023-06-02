<%-- 
    Document   : logindata
    Created on : 20 May, 2023, 1:24:31 PM
    Author     : chand
--%>

<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>login Page</title>
    </head>
    <body>
<body>
    <%!
    String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    String DB_USER = "postgres";
    String DB_PASSWORD = "1234";
    %>
    <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        

        String query = "SELECT * FROM logsign WHERE username=? AND password=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        rs = pstmt.executeQuery();

        if (rs.next()) {

            response.sendRedirect("registration.jsp");
        } else {

            out.println("<h3>Login Failed. Please try again.</h3>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    %>
    </body>
</html>

