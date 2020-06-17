<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:46
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
    <h2>POST 방식</h2>
    <%
        request.setCharacterEncoding("utf-8");
        String msg = request.getParameter("msg");
    %>
    <b>입력하신 메세지는</b><%=msg%><b>입니다.</b>
</body>
</html>
