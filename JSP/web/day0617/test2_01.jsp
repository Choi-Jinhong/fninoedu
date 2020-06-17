<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오전 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>jsp 시작</title>
</head>
<body>
<%
    int age = 20;
    String name = "홍길동";
//  내장객체 out을 통해 브라우저에 출력가능
//  jsp는 내장객체를 선호하지 않음 자바 밖에서 출력하는 것이 좋음
    out.print("내 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
%>
<h4>문자열이나 변수 출력은 표현식을 이용해서 출력을 진행</h4>
<b>이름: </b><%= name %><br>
<b>나이: </b><%= age %><br>
</body>
</html>
