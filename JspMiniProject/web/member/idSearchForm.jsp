<%@ page import="member.model.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오후 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function check(f) {
            /* 아이디 최소길이 = 5 */
            if(f.id.value.length < 5){
                alert("5글자이상 입력바람");
                return false;
            }
            /* 공백 체크 */
            var idx=f.id.value.indexOf(' '); //공백의 위치 확인
            if(idx >= 0){
                alert("아이디에 공백이 있음");
                return false;
            }
        }
        function goUse(id) {
            // 전달받은 아이드를 오픈한 윈도우로 보내고
            opener.frm.id.value=id;
            // 현재 윈도는 닫기
            window.close();
        }
    </script>
</head>
    <%
        String path = request.getContextPath();

        String key = request.getParameter("key");
        if(key==null){%>
            <!--아이디 입력 폼-->
            <form action="<%=path%>/member/idSearchForm.jsp" method="post" onsubmit="check(this)">
                <table>
                    <tr>
                        <td>
                            <b>아이디 입력: </b><input type="text" name="id" size="10">
                            <input type="hidden" name="key" value="result">
                            <input type="submit" value="중복체크">
                        </td>
                    </tr>
                </table>
            </form>
        <%}
        else{
            String id = request.getParameter("id");
            MemberDAO dao = new MemberDAO();
            boolean flag = dao.searchId(id);

            if(flag){%>
                <table>
                    <tr>
                        <td>
                            <img src="<%=path%>/img/bad.png" alt=""><br>
                            <b style="color:coral; font-weight: bold;">이미 존재하는 ID입니다.</b><br>
                            <b style="color:coral; font-weight: bold;">다른 ID로 입력바랍니다.</b><br>
                            <input type="button" value="아이디 입력" onclick="location.href='<%=path%>/member/idSearchForm.jsp'">
                        </td>
                    </tr>
                </table>
            <%}
            else{%>
                <table>
                    <tr>
                        <td>
                            <img src="<%=path%>/img/good.png" alt=""><br>
                            <b style="color:cornflowerblue; font-weight: bold;">사용가능한 ID입니다.</b><br>
                            <b style="color:cornflowerblue; font-weight: bold;">ID 생성에 성공하였습니다.</b><br>
                            <input type="button" value="사용하기" onclick="goUse('<%=id%>')">
                            <input type="button" value="아이디 입력" onclick="location.href='<%=path%>/member/idSearchForm.jsp'">
                        </td>
                    </tr>
                </table>
            <%}
        }
    %>
<body>

</body>
</html>
