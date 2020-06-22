<%@ page import="info.model.infoDAO" %>
<%@ page import="java.util.Vector" %>
<%@ page import="info.model.infoDTO" %>
<%@ page import="myBoard.model.MyBoardDAO" %>
<%@ page import="myBoard.model.MyBoardDTO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오후 3:46
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
<%
    MyBoardDAO dao = new MyBoardDAO();
    Vector<MyBoardDTO> list = dao.getAllDate();
%>
<a href="mbForm.jsp">데이터 추가</a>
<hr>
<table class="table table-bordered">
    <caption>Myboard</caption>
    <tr>
        <th width="50">번호</th>
        <th width="70">이름</th>
        <th width="150">제목</th>
        <th width="150">내용</th>
        <th width="150">작성일자</th>
        <th>수정/삭제</th>
    </tr>
    <%
        for(int i = 0; i < list.size(); i++){
            MyBoardDTO dto = list.get(i);%>
    <tr>
        <td><%=i+1%></td>
        <td><%=dto.getName()%></td>
        <td><%=dto.getSubject()%></td>
        <td><%=dto.getContent()%></td>
        <td><%=dto.getSdate()%></td>
        <td><a href="mbUpdateForm.jsp?num=<%=dto.getNum()%>">수정</a>/<a href="mbDeleteAction.jsp?num=<%=dto.getNum()%>">삭제</a></td>
    </tr>
    <%
        }%>
</table>
</body>
</html>
