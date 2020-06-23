<%@ page import="member.model.MemberDAO" %>
<%@ page import="member.model.MemberDTO" %><%--
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
    <%
        String path = request.getContextPath();
        String num=request.getParameter("num");
        MemberDAO dao=new MemberDAO();
        MemberDTO dto=dao.getData(num);
    %>
</head>
<body>
<form action="<%=path%>/member/memberUpdateAction.jsp" method="post" name="frm"
      onsubmit="">
    <table class="table table-bodered" style="width: 500px; margin: 0 auto;">
        <caption>회원가입</caption>
        <tr>
            <th>이름</th>
            <td>
                <input type="text" size="8" name="name"
                       autofocus="autofocus" value="<%=dto.getName()%>">
            </td>
        </tr>
        <tr>
            <th>아이디</th>
            <td>
                <b style="color: red;"><%=dto.getId() %></b>
                <input type="button" value="아이디입력" onclick="idopen()">
            </td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td>
                <input type="password" size="10" name="pass"
                       value="<%=dto.getPwd()%>">
            </td>
        </tr>
        <tr>
            <th>비밀번호확인</th>
            <td>
                <input type="password" size="10" name="pass2"
                       value="<%=dto.getPwd()%>">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="num" value="<%=num%>">
                <input type="submit" value="수정완료">
                <input type="button" value="회원명단"  onclick="location.href='<%=path%>/index.jsp?body=member/memberList.jsp'">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
