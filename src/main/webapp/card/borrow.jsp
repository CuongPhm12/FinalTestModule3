<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 19/11/2021
  Time: 10:55 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Borrow Management</title>
</head>
<body>
<h1>Mượn sách</h1>
<form action="" method="post">
    <table>
        <tr>
            <td>Mã mượn sách</td>
            <td>

            </td>
        </tr>
        <tr>
            <td>Tên sách</td>
            <td><select name="bookList">
                <c:forEach items="${bookList}" var="b" >
                    <option value="${b.idBook}">${b.name}</option>
                </c:forEach>
            </select></td>
        </tr>

        <tr>
            <td>Tên Học Sinh</td>
            <td><select name="studentList">
                <c:forEach items="${studentList}" var="s" >
                    <option value="${s.idStudent}">${s.nameStudent}</option>

                </c:forEach>
            </select></td>
        </tr>
        <tr>
            <td>Ngày mượn sách</td>
            <td><input type="date" ></td>
        </tr>
        <tr>
            <td>Ngày trả sách</td>
            <td><input type="date" ></td>
        </tr>
        <tr>
            <input type="submit" value="Mượn sách">

        </tr>
    </table>
</form>
</body>
</html>