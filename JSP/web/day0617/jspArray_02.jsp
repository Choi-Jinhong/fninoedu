<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>02_jspArray</title>
</head>
<body>
<%  String msg = "hi JSP ~";
    int cnt = 0;
%>

메세지 <%=msg%>
카운트: <%=++cnt%>

<%
    String[] str = {"red", "blue", "green", "orange", "navy", "purple", "yellow"};
%>

<table class="table table-bordered" style="width: 30%">
    <tr>
        <th>번호</th>
        <th>색상</th>
    </tr>
    <%
        for(int i = 0; i < str.length; i++){%>
           <tr>
               <td><%=i+1%></td>
               <td bgcolor="<%=str[i]%>"><%=str[i]%></td>
           </tr>
        <%}
    %>
</table>
</body>
</html>
