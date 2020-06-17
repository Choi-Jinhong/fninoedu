<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오후 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String grade = request.getParameter("grade");
        String[] lang = request.getParameterValues("lang");
        String favorite = request.getParameter("fname");
        String height= request.getParameter("height");
        String weight= request.getParameter("weight");
        String date = request.getParameter("date");
    %>
    <h2>*********신상 정보***************</h2>
    <b>학력: </b><%=grade%><br>
    <b>가능한 언어: </b>
    <%
        if(lang == null){%>
            사용가능한 언어 X<br>
        <%}
        else{
            for(int i = 0; i < lang.length; i++){
                %>
                <%=lang[i]%>&nbsp;
            <%}
        }
    %><br>
    <b>좋아하는 사람: </b><%=favorite%><br>
    <b>키: </b><%=height%><br>
    <b>몸무게: </b><%=weight%><br>
    <b>작성일자: </b><%=date%><br>
</body>
</html>
