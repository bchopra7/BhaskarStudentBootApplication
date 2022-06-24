<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>-->
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome to student portal</title>
</head>
<body>
<h1 align="center">
    Welcome to student portal
</h1>

<form action="addAlien" method="POST">
    <h3>Add new student details</h3>
    <label>Student Id</label><br>
    <input type="text"name="aid"><br>
    <label> Student Name</label><br>
    <input type="text"name="aname"><br>
    <label>Student Technology</label><br>
    <input type="text"name="tech"><br>
    <input type="submit"><br><br>
</form>

<form action="getAlien">
    <h3>Get student details</h3>
    <label>Student Id</label><br>
    <input type="text" name="aid"><br>
    <input type="submit"><br>
</form>

<form action="deleteAlien"  method="POST">
    <h3>Delete student details</h3>
    <label>Student Id</label><br>
    <input type="text"name="aid"><br>
    <input type="submit"><br>
</form>

<form action="editAlien"  method="POST">
    <h3>Edit student details</h3>
    <label>Student Id</label><br>
    <input type="text"name="aid"><br>
    <input type="submit"><br>
</form>
<div>
    <a th:href = "@{/viewAliens}" >Click to view all student details </a>
</div>
</body>
</html>
