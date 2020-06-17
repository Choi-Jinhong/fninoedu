<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>form 단위로 전송(post)</h2>
    <form action="myFormAction_06.jsp" method="post">
        <b>메세지: </b><input type="text" name="msg" size="20"><input type="submit" value="전송"><input type="reset" value="초기화">
    </form>
    <h2>form 단위로 전송(get)</h2>
    <form action="myFormActionGet_06.jsp" method="get">
        <b>메세지: </b><input type="text" name="msg" size="20"><input type="submit" value="전송"><input type="reset" value="초기화">
    </form>
</body>
</html>
