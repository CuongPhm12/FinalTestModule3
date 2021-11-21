<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 19/11/2021
  Time: 10:36 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách Sách</h1>
<table border="1">
    <tr>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Số lượng</th>
        <th>Mô tả</th>
        <th></th>
    </tr>
    <c:forEach items="${bookList}" var="b">
        <tr>
            <td> ${b.idBook}</td>
            <td> ${b.name}</td>
            <td> ${b.author}</td>
            <td> ${b.quantity}</td>
            <td> ${b.description}</td>
            <td><a href="/cards?action=borrow&id=${b.idBook}">Borrow</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
