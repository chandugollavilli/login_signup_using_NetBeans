<%-- 
    Document   : signupdata
    Created on : 20 May, 2023, 1:26:43 PM
    Author     : chand
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Signup Data</title>
</head>
<body>
    <%
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");


    try {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
        Statement st = con.createStatement();
        
        st.executeUpdate("insert into logsign (username,email,password) values('"+username+"','"+email+"','"+password+"')");
        
        out.println("Sucessfully");
        
        response.sendRedirect("login.jsp");
        
    } catch (Exception e) {
        
        out.println(e);
    }
    %>
</body>
</html>
