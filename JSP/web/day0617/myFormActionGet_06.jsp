<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>GET 방식</h2>
    <%
        request.setCharacterEncoding("utf-8");
        String msg = request.getParameter("msg");
    %>
    <b>입력하신 메세지는</b><%=msg%><b>입니다.</b>
</body>
</html>
