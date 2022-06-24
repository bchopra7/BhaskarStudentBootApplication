<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>-->
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All Student Details</title>
</head>
<body>
<div align="center">
    <h1> Student Details</h1>
    <table border="1">
        <thead>
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Student Technology</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="alienValue : ${listalien}">
            <td th:text="${alienValue.aid}"></td>
            <td th:text="${alienValue.aname}"></td>
            <td th:text="${alienValue.tech}"></td>
        </tr>
        </tbody>
    </table>

</div>

</body>
</html>
