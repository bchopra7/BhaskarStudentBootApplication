<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>-->
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<h3>Login</h3>
<p th:text="${error}"></p>
<form action="login" method="POST" >

   <!-- <label>Student Id</label><br>
    <input type="text"name="aid" th:value="${alien.aid}"><br>-->
    <label>Enter email</label><br>
    <input type="email"name="user_email"><br>

    <label>Enter password</label><br>
    <input type="password"name="user_pass"><br>

    <input type="submit"><br><br>
</form>
</body>
</html>
