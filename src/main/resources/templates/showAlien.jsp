<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>-->
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Details</title>
</head>
<body><table align="center" class="table" border="1">
    <h1 align="center">Student Details</h1>
    <thead class="thead-dark">
    <tr>
        <th>Student ID</th>
        <th>Student Name</th>
        <th>Student Technology</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td th:text="${alien.aid}"></td>
        <td th:text="${alien.aname}"></td>
        <td th:text="${alien.tech}"></td>
    </tr>

    </tbody>
</table>

</body>
</html>
