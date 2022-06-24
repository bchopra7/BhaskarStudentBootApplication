<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>-->
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="addAlien" method="POST">
    <h3>Edit Student details</h3>
    <label>Student Id</label><br>
    <input type="text"name="aid" th:value="${alien.aid}"><br>
    <label>Student Name</label><br>
    <input type="text"name="aname"><br>
    <label>Student Technology</label><br>
    <input type="text"name="tech"><br>
    <input type="submit"><br><br>
</form>
</body>
</html>
