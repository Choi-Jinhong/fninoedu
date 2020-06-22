<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <%
        String path = request.getContextPath();
    %>
<body margin: 0 auto;>
    <img alt="" src="<%=path%>/shop/actor1.jpg" width="400px" height = "400px" border="1">
    <img alt="" src="<%=path%>/shop/beauty1.jpg" width="400px" height = "400px"   border="1">
    <img alt="" src="<%=path%>/shop/beauty2.jpg" width="400px" height = "400px"  border="1">
    <img alt="" src="<%=path%>/shop/beauty3.jpg" width="400px" height = "400px"  border="1">
    <img alt="" src="<%=path%>/shop/beauty4.jpg" width="400px" height = "400px"  border="1">
    <img alt="" src="<%=path%>/shop/bottle01.jpg" width="400px" height = "400px"  border="1">
</body>
</html>
