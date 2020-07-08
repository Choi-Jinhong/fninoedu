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
<form action="list" method="post">
	<div class="container">
		<table class="table table-striped" style="width: 400px;" border="1">
			<caption>사원정보입력</caption>
			<tr>
				<th>사원명</th>
				<td><input type="text" name="name" size="10"></td>
			</tr>
			
			<tr>
				<th>급여</th>
				<td><input type="text" name="pay" size="10"></td>
			</tr>	
			
			<tr>
				<th>나이</th>
				<td><input type="text" name="age" size="10"></td>
			</tr>	
			
			<tr>
				<th>혈액형</th>
				<td><input type="text" name="blood" size="10"></td>
			</tr>	
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송" class="btn btn=info">
				</td>
			</tr>
					
		</table>	
	</div>

</form>
</body>
</html>