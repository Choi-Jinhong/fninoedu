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
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
    <%
      request.setCharacterEncoding("utf-8");
      String season = request.getParameter("season");
      String[] yasik = request.getParameterValues("yasik");
      String date = request.getParameter("date");
    %>
    <h3>데이터 읽어오기</h3>
    <hr>
    <p>좋아하는 계절: <b><%=season%></b></p>
    <p>좋아하는 야식:
        <%
            if(yasik == null){%>
                <b>좋아하는 야식 없음</b>
            <%}
            else{
                for(int i = 0; i < yasik.length; i++){%>
                    <b><%=yasik[i]%></b>
                <%}
            }%></p>
    <p>날짜: <b><%=date%></b></p>
</body>
</html>
