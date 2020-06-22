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
    <style type="text/css">
    body{
        background-color: white;
    }
    a{
        font-size: 20px;
    }
    </style>
</head>
 <%
        String path = request.getContextPath();
 %>
<body>
<a href="<%=path%>/">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=path%>/">Login</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=path%>/index.jsp?body=member/memberForm.jsp">SignUp</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=path%>/">Memo</a>&nbsp;&nbsp;&nbsp;
<a href="<%=path%>/">Board</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=path%>/">Notice</a> &nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>
