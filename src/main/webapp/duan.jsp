 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/15
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学士后 在线短信平台</title>
    <link type="text/css" rel="stylesheet" href="css/sms.css" />
    <script type="text/javascript" src="scripts/jquery.js"></script>
</head>
<body>
<div id="main">
    <div class="mainbox">
        <div class="title myMessage png"></div>
        <div class="menu">
            <span>当前用户：<a href=>admin</a></span>
            <span><a href=>发短消息</a></span>
            <span><a href=>退出</a></span>
        </div>
        <div id="error"></div>
        <div class="content messageList">
            <ul>
                <c:forEach items="${list}" var="msg">
                    <li>
                        <em>${msg.msg_create_date}</em>
                        <em><a href=>回信</a></em>
                        <em><a href=>删除</a></em>
                        <p>
                            <strong><a href=>abc</a></strong>
                            abc
                        </p>
                </c:forEach>

                <li>
                    <em>2013-06-13</em>
                    <em><a href=>回信</a></em>
                    <em><a href=>删除</a></em>
                    <p>
                        <strong><a href=>abc</a></strong>
                        abc
                    </p>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
