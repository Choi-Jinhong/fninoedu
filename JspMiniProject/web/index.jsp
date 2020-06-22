<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
  </head>
  <%
     String path = request.getContextPath();
     String body = "layout/body.jsp";

     if(request.getParameter("body") != null){
       body=request.getParameter("body");
     }
  %>
  <body>
  <!--title-->
    <div style="position: absolute; left: 5%; right: 10%; top: 30px; width: 700px; height: 250px;">
        <jsp:include page="layout/header.jsp"/>
    </div>
  <!--main-->
    <div style="position: absolute; left: 100px; top: 400px; width: 1500px; height: 1000px;">
        <jsp:include page="<%=body%>"/>
    </div>
  <!--menu-->
    <div style="position: absolute; left: 620px; top: 350px; width: 800px; height: 50px; font-size: 10pt">
        <jsp:include page="layout/menu.jsp"/>
    </div>
  <!--footer-->
    <div style="position: absolute; top: 1500px; width: 700px; height: 100px;">
        <jsp:include page="layout/bottom.jsp"/>
    </div>
  </body>
</html>
