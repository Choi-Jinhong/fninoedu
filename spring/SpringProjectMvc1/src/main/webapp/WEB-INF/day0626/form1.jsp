<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<h2>Get방식의 폼</h2>
<form action="read1" method="get">
	이름: <input type="text" name="name" size="10"><br>
	나이: <input type="text" name="age" size="8"><br>
	<button type="submit">get방식의 전송</button>
</form>

<hr>
<h2>Post방식의 폼-dto</h2>
<form action="read2" method="post">
	상품: <input type="text" name="sang" size="10"><br>
	가격: <input type="text" name="price" size="8"><br>
	<button type="submit">post방식의 전송</button>
</form>
<hr>
<h2>Post방식의 폼-Map방식</h2>
<form action="read3" method="post">
	혈액형: <input type="text" name="blood" size="10"><br>
	별자리: <input type="text" name="star" size="8"><br>
	<button type="submit">post방식의 전송</button>
</form>

</body>
</html>