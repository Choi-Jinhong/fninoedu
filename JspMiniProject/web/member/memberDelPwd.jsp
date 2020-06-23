<%--
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
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <%
        String path = request.getContextPath();
        String num = request.getParameter("num");
    %>
</head>
<body>
<form action="<%=path%>/member/memberDelPwdAction.jsp" method="post">
    <table class="table table-bordered" style="width: 300px;">
        <tr height="150px" valign="middle">
            <td>
                <b>가입 시 입력한 비밀번호를 입력해주세요.</b><br>
                <input type="password" name="pwd" size="7" autofocus="autofocus" required="required">
                <input type="hidden" name="num" value="<%=num%>">
                <input type="submit" value="확인">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
