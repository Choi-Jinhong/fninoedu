<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-17
  Time: 오후 1:19
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
<form action="radioCheckAction_09.jsp" method="post">
    <table>
        <caption>Radio&Check</caption>
        <tr height="20">
            <td>
                <b>최종 학력 선택</b>&nbsp;
                <input type="radio" name="grade" value="고등학교">고등학교&nbsp;<!--radio는 같은 부류로 생성 시 name이 모두 동일해야 함-->
                <input type="radio" name="grade" value="전문대학">전문대학&nbsp;
                <input type="radio" name="grade" value="대학교">대학교&nbsp;
                <input type="radio" name="grade" value="대학원">대학원&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <b>사용가능 한 언어</b>&nbsp;
                <input type="checkbox" name="lang" value="C언어">C언어&nbsp;
                <input type="checkbox" name="lang" value="자바">Java&nbsp;&nbsp;
                <input type="checkbox" name="lang" value="파이썬">Python&nbsp;
                <input type="checkbox" name="lang" value="고">Go&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td>
                <b>우리반에서 가장 좋은 사람?</b>
                <select name="fname">
                    <option value = "강동원">강동원</option>
                    <option value = "김은하">김은하</option>
                    <option value = "홍길동">홍길동</option>
                    <option value = "김남길">김남길</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <b>당신의 키는 몇cm 입니까?</b>
                <input type="number" name="height" min="150" max="230" step="2" value="150">cm
            </td>
        </tr>
        <tr>
            <td>
                <b>당신의 몸무게는 몇 kg 입니까?</b>
                <input type="number" name="weight" min="40" max="120" step="2" value="70">kg
            </td>
        </tr>
        <tr>
            <td>
                <b>날짜선택</b>
                <input type="date" name="date">
            </td>
        </tr>
        <tr>
            <td style="text-align: right">
                <input type="submit" value="제출"><input type="reset" value="초기화">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
