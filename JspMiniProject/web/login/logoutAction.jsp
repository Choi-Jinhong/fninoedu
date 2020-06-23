<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-23
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String path = request.getContextPath();
    session.removeAttribute("loginOk");
    response.sendRedirect(path + "/index.jsp?body=login/loginMain.jsp");
%>
<body>
</body>
</html>
