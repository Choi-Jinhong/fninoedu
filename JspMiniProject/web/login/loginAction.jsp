<%@ page import="member.model.MemberDTO" %>
<%@ page import="member.model.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-23
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String path = request.getContextPath();
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String save = request.getParameter("savecheck");

    MemberDAO dao = new MemberDAO();
    boolean flag = dao.isLogin(id, pwd);

    if(flag){
        //로그인 상태인지를 확인할 수 있는 세션 저장
        session.setAttribute("loginOk", "yes");

        //아이디와 체크 값을 저장
        session.setAttribute("idOk", id);

        //체크하면 값으로 on 안하면 null이 저장
        session.setAttribute("saveOk", save);

        //세션에선 로그인 유지시간 설정 가능
        session.setMaxInactiveInterval(60*60*8); //8시간

        //로그인 메인으로 이동
        response.sendRedirect(path + "/index.jsp?body=login/loginMain.jsp");
    }
    else{%>
        <script type="text/javascript">
            alert("아이디/비밀번호 불일치");
            history.back();
        </script>
    <%}
%>
<body>

</body>
</html>
