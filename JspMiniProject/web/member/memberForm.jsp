<%--
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
    <script type="text/javascript">
        function idopen() {
            window.open('member/idSearchForm.jsp', 'w','width=700px, height=700px, left=500px, top=100px');
        }

        function check(pwd) {
            //입력체크
            if(pwd.id.value.length == 0){
                alert("아이디 입력 버튼을 눌러주세요");
                return false;
            }
            // 2개의 비밀번호 같은지를 확인
            if(pwd.pwd1.value != pwd.pwd2.value){
                alert("입력하신 비밀번호가 다릅니다.");
                pwd.pwd1.value='';
                pwd.pwd2.value='';
                pwd.pwd1.focus();
                return false;
            }
        }
    </script>
</head>
<%
    String path = request.getContextPath();
%>
<body>
<form action="<%=path%>/member/memberAction.jsp" method="post" name="frm" onsubmit="return check(this)">
    <table class="table table-bordered" style="width: 500px; margin: 0 auto;">
        <caption>회원가입</caption>
        <tr>
            <th>이름</th>
            <td><input type="text" size="8" name="name" required="required" autofocus="autofocus" placeholder="이름"></td>
        </tr>
        <tr>
            <th>ID</th>
            <td>
                <input type="text" size="8" name="id" required="required" readonly="readonly">
                <input type="button" value="아이디 입력" onclick="idopen()">
            </td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td><input type="password" size="10" name="pwd1" required="required" placeholder="비밀번호"></td>
        </tr>
        <tr>
            <th>비밀번호 확인</th>
            <td><input type="password" size="10" name="pwd2" required="required" placeholder="비밀번호"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="회원가입">
                <input type="reset" value="초기화">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
