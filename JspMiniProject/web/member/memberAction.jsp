<%@ page import="member.model.MemberDTO" %>
<%@ page import="member.model.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오전 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<%
    String path = request.getContextPath();
%>
<body>
    <%
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd1");

        MemberDTO dto = new MemberDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setPwd(pwd);

        MemberDAO dao = new MemberDAO();
        dao.insertMem(dto);

        response.sendRedirect(path + "/index.jsp?body=member/successPage.jsp");
    %>
</body>
</html>
