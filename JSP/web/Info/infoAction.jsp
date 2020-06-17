<%@ page import="info.model.infoDTO" %>
<%@ page import="info.model.infoDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오후 3:46
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

        infoDTO dto = new infoDTO();

        dto.setName("name");
        dto.setAddr("addr");

        infoDAO daooo = new infoDAO();
        daooo.infoInsert(dto);

        response.sendRedirect("infoList.jsp");
    %>

</body>
</html>
