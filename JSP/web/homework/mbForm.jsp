<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-19
  Time: 오후 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mbForm.jsp</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
    <form action="mbFormAction.jsp" method="post">
        <table class="table table-bordered">
            <caption>게시글 작성</caption>
            <tr>
                <th>작성자</th>
                <td><input type="text" name="name" placeholder="작성자 명"></td>
            </tr>
            <tr>
                <th>제목</th>
                <td><input type="text" name="subject" placeholder="게시글 제목"></td>
            </tr>
            <tr>
                <th>내용</th>
                <td><input type="text" name="content" placeholder="내용"></td>
            </tr>
            <tr style="text-align: right">
                <td colspan="2"><input type="submit" value="전송"></td>
            </tr>
        </table>
    </form>
<input type="hidden" name="check" value="insert">
</body>
</html>
