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
<h1>사원정보</h1>
<h2>사원명: ${dto.name }<br></h2>
<h2>급여: ${dto.pay }<br></h2>
<h2>나이: ${dto.age }<br></h2>
<h2>혈액형: ${dto.blood }<br></h2>

</body>
</html>