<%@ page import="profile.model.ProfileDAO" %>
<%@ page import="profile.model.ProfileDTO" %>
<%@ page import="java.sql.Timestamp" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-18
  Time: 오후 3:41
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
        String blood = request.getParameter("blood");
        String name = request.getParameter("name");
        String hp = request.getParameter("hp1") + request.getParameter("hp2") + request.getParameter("hp3");
        ProfileDTO dto = new ProfileDTO();
        dto.setBlood(blood);
        dto.setName(name);
        dto.setHp(hp);

        ProfileDAO dao = new ProfileDAO();
        dao.profileInsert(dto);

        response.sendRedirect("profileList.jsp");
    %>
</body>
</html>
