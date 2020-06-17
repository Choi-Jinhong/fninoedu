<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오후 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
    <form action="infoAction.jsp" method="post">
        <table class="table table-bordered">
            <tr>
                <th>이름</th>
                <td><input type="text" name="name" size="7" placeholder="이름"></td>
            </tr>
            <tr>
                <th>주소</th>
                <td><input type="text" name="addr" size="20" placeholder="주소"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: right">
                    <input type="submit" value="전송">
                    <input type="button" value="목록" onclick="location.href='infoList.jsp'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
