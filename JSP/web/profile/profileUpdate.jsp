<%@ page import="profile.model.ProfileDTO" %>
<%@ page import="profile.model.ProfileDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-19
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>편집</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
<%
    String num = request.getParameter("num");
    ProfileDAO dao = new ProfileDAO();
    ProfileDTO dto = dao.getData(num);
%>
<form action="profileAction.jsp?check='update'" method="post">
    <table class = "table table-bordered" style="width: 350px">
        <caption style="border: 3px solid black; text-align: center; font-weight: bold">신상정보 변경</caption>
        <tr>
            <th>이름</th>
            <td><input type="text" name="name" size="8" value="<%=dto.getName()%>" required="required"></td>
        </tr>
        <tr>
            <th>혈액형</th>
            <td>
                <select size="1" name="blood">
                    <%
                        String[] str ={"A", "B", "O", "AB"};
                        for(int i = 0; i < str.length; i++){
                            if(dto.getBlood().equalsIgnoreCase(str[i]+"형"))
                            {%>
                                <option value="<%=str[i]%>" selected="selected"><%=str[i]%>형</option>
                        <%}
                            else{%>
                                <option value="<%=str[i]%>"><%=str[i]%>형</option>
                        <%}
                        }
                        %>
                </select>
            </td>
        </tr>
        <tr>
            <th>핸드폰</th>
            <td>
                <select size="1" name="hp1">
                    <option>010</option>
                    <option>011</option>
                    <option>017</option>
                    <option>019</option>
                </select>
                <b>-</b>
                <input type="text" name="hp2" size="3" required="required" onkeyup="goFocus(this)">
                <b>-</b>
                <input type="text" name="hp3" size="3" required="required">
            </td>
        </tr>
        <tr>
            <th>생년월일</th>
            <td><input type="date" name="birth" required="required"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: right">
                <input type="submit" value="변경 저장" class="btn btn-outline-secondary">
                <input type="button" value="내용 삭제" onclick="location.href='profileList.jsp'" class="btn btn-darker">
            </td>
        </tr>
    </table>
</form>
<input type="hidden" name="num" value="<%=dto.getNum()%>">
</body>
</html>
