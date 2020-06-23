<%@ page import="member.model.MemberDAO" %><%--
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
%>
<body>
    <%
        String id = (String)session.getAttribute("idOk");
        MemberDAO dao = new MemberDAO();
        String name = dao.getName(id);
    %>
    <br><br>
    <b style="color: blue;"><%=name%>님이 로그인 하셨습니다.</b>
    <input type="button" value="로그아웃" onclick="location.href='<%=path%>/login/logoutAction.jsp'">
    <hr>
    <img alt="" src="<%=path%>/img/mainImg.png">
</body>
</html>
