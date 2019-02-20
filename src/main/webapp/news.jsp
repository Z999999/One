<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/12
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="" method="post">
        <section name="topicinfo">
            <c:forEach items="${tt}" var="t">
                <option value="${t.tid}">${t.tname}</option>
            </c:forEach>

            <option value="2">国外</option>
        </section>
        <input type="submit" value="查询">
    </form>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>标题</td>
            <td>类别</td>
            <td>作者</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="n">
            <tr>
                <td>${n.nid}</td>
                <td>${n.ntitle}</td>
                <td>${n.cha.tname}</td>
                <td>${n.nauthor}</td>
                <td>修改 删除</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
