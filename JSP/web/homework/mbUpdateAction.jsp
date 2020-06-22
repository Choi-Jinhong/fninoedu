<%@ page import="myBoard.model.MyBoardDTO" %>
<%@ page import="myBoard.model.MyBoardDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-21
  Time: 오전 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String subject = request.getParameter("subject");
    String content = request.getParameter("content");
    String check = request.getParameter("check");

    MyBoardDTO dto = new MyBoardDTO();
    dto.setName(name);
    dto.setSubject(subject);
    dto.setContent(content);

    MyBoardDAO dao = new MyBoardDAO();

    dao.mbUpdate(dto);

    response.sendRedirect("mbList.jsp");
%>
</body>
</html>
