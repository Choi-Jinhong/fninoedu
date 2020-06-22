<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-18
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <script type="text/javascript" name="frm">
        function goFocus(hp) {
            if(hp.value.length == 4){
                frm.hp3.focus();
            }
        }
    </script>
</head>
<body>
    <form action="profileAction.jsp?check='insert'" method="post">
        <table class = "table table-bordered" style="width: 350px">
            <caption style="border: 3px solid black; text-align: center; font-weight: bold">신상정보</caption>
            <tr>
                <th>이름</th>
                <td><input type="text" name="name" size="8" placeholder="이름" required="required"></td>
            </tr>
            <tr>
                <th>혈액형</th>
                <td>
                    <select size="1" name="blood">
                        <option>A형</option>
                        <option>B형</option>
                        <option>O형</option>
                        <option>AB형</option>
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
                    <input type="submit" value="정보 저장" class="btn btn-outline-secondary">
                    <input type="button" value="모든 정보" onclick="location.href='profileList.jsp'" class="btn btn-darker">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
