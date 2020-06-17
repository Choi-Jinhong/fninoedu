<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="myData_05.jsp"%>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>05_myDataInclude</title>
</head>
<body style="background-color: <%=bcolor%>; color: <%=tcolor%>">
    <b>이름: </b><%=name%><br>
    <b>메세지: </b><%=msg%>
</body>
</html>
