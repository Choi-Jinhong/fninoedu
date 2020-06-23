<%@ page import="member.model.MemberDTO" %>
<%@ page import="member.model.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-23
  Time: 오전 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String path = request.getContextPath();
    String num = request.getParameter("num");
    String pwd = request.getParameter("pwd");

    MemberDAO dao = new MemberDAO();

    boolean flag = dao.isEqualPwd(num, pwd);

    if(flag){
        String s = path + "/index.jsp?body=member/memberUpdateForm.jsp?num=" + num;
        response.sendRedirect(s);
    }
    else{%>
        <script type="text/javascript">
            alert("비밀번호가 틀립니다.");
            history.back();
        </script>
    <%}
%>
<body>
</body>
</html>
