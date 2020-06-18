<%@ page import="info.model.infoDTO" %>
<%@ page import="info.model.infoDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-18
  Time: 오후 1:24
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
        String addr = request.getParameter("addr");
        String num = request.getParameter("num");

        infoDTO dto = new infoDTO();
        dto.setNum(num);
        dto.setName(name);
        dto.setAddr(addr);

        infoDAO dao = new infoDAO();
        dao.infoUpdate(dto);

        response.sendRedirect("infoList.jsp");
    %>
</body>
</html>
