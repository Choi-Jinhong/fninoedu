<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
    <h2>여러데이터 전송</h2><br>
    <form action="myFormsAction_07.jsp" method="post">
        <table class="table table-hover" style="">
            <tr>
                <th>이름</th>
                <td>
                    <input type="text" name="name" size="20" placeholder="이름">
                </td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td><input type="password" name="pwd" size="20" placeholder="비밀번호"></td>
            </tr>
            <tr>
                <th>운전면허</th>
                <td><input type="checkbox" name="license">운전면허</td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="전송"><input type="reset" value="초기화"></td>
            </tr>
        </table>
    </form>
</body>
</html>
