<%-- 
    Document   : login
    Created on : 20 May, 2023, 1:24:17 PM
    Author     : chand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
</head>
<style>
.container {
    width: 300px;
    margin: 0 auto;
    padding-top: 100px;
}
h1 {
  text-align: center;
}

form {
    margin-top: 50px;
}

label {
    display: block;
    margin-bottom: 10px;
}

input[type="text"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
}

 input[type="submit"]{
            border: none;
            background-color:green;
            padding: 10px;
            border-radius: 5px;
 }

p {
  text-align: center;
}

  </style>
<body>
  <div class="container">
    <form action="logindata.jsp" method="POST">
    <h1>Login</h1>
    <form action="logindata.jsp" method="POST">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>

      <input type="submit" value="Login">
    </form>
    <p>Don't have an account? <a href="signup.jsp">Sign up</a></p>
  </div>
</body>
</html>

