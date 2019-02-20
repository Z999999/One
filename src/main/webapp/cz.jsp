<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/15
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="Jquery/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(function () {
            $("table tr:first").css("font-size","20px")
            $("table tr:first").css("background","red")
            $("table tr:odd").css("background","aqua")
        })
    </script>
</head>
<body>
<form action="s?type=sel">
    <table border="1">
        <tr>
            <td>预定编号</td>
            <td>会议室</td>
            <td>预定人</td>
            <td>日期</td>
        </tr>

        <c:forEach items="${list}" var="f">
            <tr>
                <td>${f.id}</td>
                <td>${f.meeting_name}</td>
                <td>${f.advance_name}</td>
                <td>${f.meeting_order}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="czadd.jsp">预定会议室</a>
</form>
</body>
</html>
