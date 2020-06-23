<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-23
  Time: 오후 3:05
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
    String saveOk = (String)session.getAttribute("saveOk");
    String id=(String)session.getAttribute("idOk");
%>
<body style="margin: 0 auto;">
    <form action="<%=path%>/login/loginAction.jsp" method="post">
        <table class = "table table-bordered" style="width: 300px">
            <caption><b style="font-size: 15pt">세션 로그인</b></caption>
            <tr>
                <td colspan="2">
                    <% if(saveOk==null) {
                    %>
                        <input type="checkbox" name="savecheck">아이디 저장
                    <%
                        }
                    else{%>
                      <input type="checkbox" name="savecheck" checked="checked">아이디 저장
                    <%
                        }%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>보안 로그인</b>
                </td>
            </tr>
            <tr>
                <th>아이디</th>
                <td>
                    <%
                        if(saveOk == null){%>
                            <input type="text" name="id" size="10" autofocus="autofocus" required="required">
                        <%}
                        else{%>
                             <input type="text" name="id" size="10" autofocus="autofocus" required="required" value="<%=id%>">
                        <%}
                    %>
                </td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td>
                    <input type="password" name="pwd" size="13" required="required">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="로그인">
                    <input type="button" value="회원가입" onclick="location.href='<%=path%>/index.jsp?body=member/memberForm.jsp'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
