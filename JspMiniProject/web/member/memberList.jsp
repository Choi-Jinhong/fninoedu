<%@ page import="member.model.MemberDAO" %>
<%@ page import="java.util.Vector" %>
<%@ page import="member.model.MemberDTO" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오전 11:17
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
    %>
</head>
<body>
    <%
        MemberDAO dao = new MemberDAO();
        Vector<MemberDTO> list = dao.getAllData();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH");
    %>
    <div class="container">
        <b style="color: coral">총 <%=list.size()%>명의 회원이 있습니다.</b>
        <table class="table table-bordered">
            <caption>회원정보</caption>
            <th>id</th>
            <th>pwd</th>
            <th>이름</th>
            <th>가입날짜</th>
            <th>수정/삭제</th>
            <%
                for(int i = 0; i < list.size(); i++){
                    MemberDTO dto = list.get(i);%>
            <tr>
                <td><%=dto.getId()%></td>
                <td><%=dto.getPwd()%></td>
                <td><%=dto.getName()%></td>
                <td><%=sdf.format(dto.getSday())%></td>
                <td><a href="<%=path%>/index.jsp?body=member/memberUpdatePwdForm.jsp?num=<%=dto.getNum()%>">수정</a>/<a href="<%=path%>/index.jsp?body=member/memberDelPwd.jsp?num=<%=dto.getNum()%>">삭제</a></td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
</body>
</html>
