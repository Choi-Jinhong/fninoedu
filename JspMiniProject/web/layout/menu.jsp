<%--
  Created by IntelliJ IDEA.
  User: 최진홍
  Date: 2020-06-22
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--    <style type="text/css">--%>
<%--    body{--%>
<%--        background-color: white;--%>
<%--    }--%>
<%--    a{--%>
<%--        font-size: 20px;--%>
<%--    }--%>
<%--    </style>--%>
<%--</head>--%>
<%-- <%--%>
<%--        String path = request.getContextPath();--%>
<%-- %>--%>
<%--<body>--%>
<%--<a href="<%=path%>/">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--<a href="<%=path%>/index.jsp?body=login/loginMain.jsp">Login</a> &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--<a href="<%=path%>/index.jsp?body=member/memberForm.jsp">SignUp</a> &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--<a href="<%=path%>/">Memo</a>&nbsp;&nbsp;&nbsp;--%>
<%--<a href="<%=path%>/index.jsp?body=member/memberList.jsp">List</a> &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--<a href="<%=path%>/">Notice</a> &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--</body>--%>
<%--</html>--%>
    <!DOCTYPE html>
    <html>
    <head>
    <%
        String path = request.getContextPath();
    %>
    <meta charset="utf-8" />
    <title>CSS3 Animated Navigation Menu | Tutorialzine Demo</title>

    <!-- Our CSS stylesheet file -->
    <link rel="stylesheet" href="<%=path%>/assets/css/styles.css"/>

    <!-- Font Awesome Stylesheet -->
    <link rel="stylesheet" href="<%=path%>/assets/font-awesome/css/font-awesome.css"/>

    <!-- Including Open Sans Condensed from Google Fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700,300italic" />

    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    </head>

    <body>

    <nav id="colorNav">
    <ul>
    <li class="green">
    <a href="<%=path%>/index.jsp" class="icon-home"></a>
    <ul>
    <li><a href="http://tutorialzine.com/2012/10/css3-dropdown-menu/">Back to the tutorial</a></li>
    <li><a href="http://tutorialzine.com/2012/10/css3-dropdown-menu/#comments">Get help</a></li>
    <li><a href="http://tutorialzine.com/2012/10/css3-dropdown-menu/">Download this example</a></li>
    </ul>
    </li>
    <li class="red">
    <a href="#" class="icon-cogs"></a>
    <ul>
    <li><a href="<%=path%>/index.jsp?body=login/loginMain.jsp">로그인</a></li>
    <li><a href="<%=path%>/index.jsp?body=member/memberForm.jsp">회원가입</a></li>
    <li><a href="<%=path%>/index.jsp?body=member/memberList.jsp">회원명단</a></li>
    </ul>
    </li>
    <li class="blue">
    <a href="#" class="icon-twitter"></a>
    <ul>
    <li><a href="http://twitter.com/Tutorialzine">Follow us on Twitter</a></li>
    <li><a href="http://www.facebook.com/Tutorialzine">Find us on Facebook</a></li>
    </ul>
    </li>
    <li class="yellow">
    <a href="#" class="icon-beaker"></a>
    <ul>
    <li><a href="http://tutorialzine.com/tag/php/">PHP tutorials</a></li>
    <li><a href="http://tutorialzine.com/tag/jquery/">jQuery techniques</a></li>
    <li><a href="http://tutorialzine.com/tag/css/">CSS articles</a></li>
    <li><a href="http://tutorialzine.com/category/tutorials/">Everything else</a></li>
    </ul>
    </li>
    <li class="purple">
    <a href="#" class="icon-envelope"></a>
    <ul>
    <li><a href="http://tutorialzine.com/contact/">Contact us</a></li>
    </ul>
    </li>
    </ul>
    </nav>

    <footer>
    <h2><i>Tutorial:</i> CSS3 Animated Navigation Menu</h2>
    <a class="tzine" href="http://tutorialzine.com/2012/10/css3-dropdown-menu/">Head on to <i>Tutorial<b>zine</b></i> to download this example</a>
    </footer>

    <!-- BSA AdPacks code. Please ignore and remove.-->
    <script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
    <script src="http://cdn.tutorialzine.com/misc/adPacks/v1.js" async></script>

    </body>
    </html>
