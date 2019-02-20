<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/19
  Time: 9:29
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
<form action="k?type=sel">
    <table border="1">
        <tr>
            <td>员工姓名</td>
            <td>所属部门</td>
            <td>考勤日期</td>
            <td>考勤状态</td>
        </tr>

        <c:forEach items="${list}" var="f">
            <tr>
                <td>${f.empname}</td>
                <td>${f.dept}</td>
                <td>${f.chkdate}</td>
                <td>${f.status}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="k.jsp">考勤登记</a>
</form>
</body>
</html>
