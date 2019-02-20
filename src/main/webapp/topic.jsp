 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/13
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>123456</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>名称</td>
        </tr>
        <c:forEach items="${p.topicslist}" var="t">
            <tr>
                <td>${t.tId}</td>
                <td>${t.tName}</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="2">
            <a href="topic?type=selBypage&pageindex=1">首页</a>
                <c:if test="${p.currpage>1}">
                    <a href="topic?type=selBypage&pageindex=${p.currpage-1}">上一页</a>
                </c:if>
                <c:if test="${p.currpage<p.totalPageCount}">
                    <a href="topic?type=selBypage&pageindex=${p.currpage+1}">下一页</a>
                </c:if>
            <a href="topic?type=selBypage&pageindex=${p.totalPageCount}">尾页</a>
            </td>
        </tr>
    </table>
</body>
</html>
