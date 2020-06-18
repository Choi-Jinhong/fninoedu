<%@ page import="info.model.infoDAO" %>
<%@ page import="java.util.Vector" %>
<%@ page import="info.model.infoDTO" %><%--
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
        infoDAO dao = new infoDAO();
        Vector<infoDTO> list = dao.getAllDatas();
    %>
    <a href="infoForm.jsp">데이터 추가</a>
    <hr>
    <table class="table table-bordered">
        <caption>info리스트 출력</caption>
        <tr>
            <th width="50">번호</th>
            <th width="70">이름</th>
            <th width="150">주소</th>
            <th width="150">현재날짜</th>
            <th>수정/삭제</th>
        </tr>
        <%
            for(int i = 0; i < list.size(); i++){
                infoDTO dto = list.get(i);%>
                <tr>
                    <td><%=i+1%></td>
                    <td><%=dto.getName()%></td>
                    <td><%=dto.getAddr()%></td>
                    <td><%=dto.getSdate()%></td>
                    <td><a href="infoUpdateForm.jsp?num=<%=dto.getNum()%>">수정</a>/<a href="infoDeleteAction.jsp?num=<%=dto.getNum()%>">삭제</a></td>
                </tr>
                <%
            }%>
    </table>
</body>
</html>
