<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 11:26
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
    <%
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String license = request.getParameter("license");
    %>
    <h3>결과 출력</h3><hr>
    <b>이름: <%=name%></b><br>
    <b>패스워드: <%=pwd%></b><br>
    <b>운전면허 유무: <%=license==null? "미취득": "취득"%></b><br>
</body>
</html>
