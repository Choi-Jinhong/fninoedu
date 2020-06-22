<%@ page import="profile.model.ProfileDTO" %>
<%@ page import="profile.model.ProfileDAO" %>
<%@ page import="java.util.Vector" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-18
  Time: 오후 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>신상정보 DB</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
    <table class="table table-bordered">
        <caption style="text-align: center">회원정보 DB</caption>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>혈액형</th>
            <th>전화번호</th>
            <th>생년월일</th>
            <th>편집</th>
        </tr>
        <%
            ProfileDAO dao = new ProfileDAO();
            Vector<ProfileDTO> list = dao.getAllData();
            for(int i = 0; i < list.size(); i++){
                ProfileDTO dto = list.get(i);%>
                <tr>
                    <td><%=i+1%></td>
                    <td><%=dto.getName()%></td>
                    <td><%=dto.getBlood()%></td>
                    <td><%=dto.getHp()%></td>
                    <td><%=dto.getBirth()%></td>
                    <td><input type="button" onclick="location.href='profileUpdate.jsp?num=<%=dto.getNum()%>'" value="편집" class="btn btn-dark"></td>
                </tr>
            <%
            }
        %>
    </table>
    <b style="text-align: center"><input type="button" value="추가" style="float:right; margin-right: 10px" class="btn btn-dark" onclick="location.href='profileForm.jsp'"></b>
</body>
</html>
