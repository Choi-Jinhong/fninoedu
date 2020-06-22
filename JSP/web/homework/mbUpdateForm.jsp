<%@ page import="myBoard.model.MyBoardDAO" %>
<%@ page import="myBoard.model.MyBoardDTO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-19
  Time: 오후 5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
<%
    String num = request.getParameter("num");
    MyBoardDAO dao = new MyBoardDAO();
    MyBoardDTO dto = dao.getDate(num);
%>
<form action="mbFormAction.jsp" method="post">
    <table class="table table-bordered">
        <caption>게시글 작성</caption>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="name" value="<%=dto.getName()%>"></td>
        </tr>
        <tr>
            <th>제목</th>
            <td><input type="text" name="subject" value="<%=dto.getSubject()%>"></td>
        </tr>
        <tr>
            <th>내용</th>
            <td><input type="text" name="content" value="<%=dto.getContent()%>"></td>
        </tr>
        <tr style="text-align: right">
            <td colspan="2"><input type="submit" value="전송"></td>
        </tr>
    </table>
</form>
</body>
</html>
