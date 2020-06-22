<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오후 3:34
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
<body style="text-align: center">
    <p style="font-size: 20pt; color: blue;">회원가입을 축하입니다.</p><br><br>
    <a href="" style="text-align: center">로그인</a><b>/</b>
    <a href="<%=path%>/index.jsp?body=member/memberList.jsp" style="text-align: center">회원명단</a>
</body>
</html>
