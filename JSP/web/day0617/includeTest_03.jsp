<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>03_includeTest</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
    <h4>include Start</h4>
    <h4>예제 1</h4>
    <jsp:include page="test2_01.jsp"/><br>
    <h4>예제 2</h4>
    <jsp:include page="jspArray_02.jsp"/><br>
    <h4>include Finish</h4>
</body>
</html>
