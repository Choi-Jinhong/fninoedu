<%@ page import="member.model.MemberDTO" %>
<%@ page import="member.model.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-23
  Time: 오전 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String path = request.getContextPath();
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

    response.sendRedirect(path + "/index.jsp?body=member/memberList.jsp");
%>
<body>

</body>
</html>
