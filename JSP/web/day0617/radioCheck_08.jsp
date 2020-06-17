<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
    <form action="radioCheckAction_08.jsp" method="post">
        <table class="table table-striped">
            <tr>
                <td><b>지금 계절은? &nbsp;&nbsp;</b><input type="radio" name="season" value="봄">봄&nbsp;&nbsp;
                                <input type="radio" name="season" value="여름">여름&nbsp;&nbsp;
                                <input type="radio" name="season" value="가을">가을&nbsp;&nbsp;
                                <input type="radio" name="season" value="겨울">겨울&nbsp;&nbsp;</td>
            </tr>
            <tr>
                <td><b>좋아하는 야식은? &nbsp;&nbsp;</b>
                    <input type="checkbox" name="yasik" value="치맥">치맥&nbsp;&nbsp;
                    <input type="checkbox" name="yasik" value="족발">족발&nbsp;&nbsp;
                    <input type="checkbox" name="yasik" value="피자">피자&nbsp;&nbsp;
                    <input type="checkbox" name="yasik" value="곱창">곱창&nbsp;&nbsp;</td>
            </tr>
            <tr>
                <td>
                    <b>날짜를 고르시오.</b>&nbsp;&nbsp;
                    <input type="date" name="date">
                </td>
            </tr>
            <tr>
                <td style="text-align: right"><input type="submit" value="제출"><input type="reset" value="초기화"></td>
            </tr>
        </table>
    </form>
</body>
</html>
