<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/12
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        div{
            float: right;
            color: red;
        }
        table{
            width: 100%;
        }
    </style>
    <script src="Jquery/jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("table tr:first").css("background","orange");
            $("table tr:odd").css("background","orange");
        })
    </script>
</head>
<body>
<table border="2">
    <tr>
        <td colspan="6" >
            俱乐部会员信息
        </td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>住址</td>
        <td>Email</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td><a href="update?type=sel&id=${stu.mid}">
                    ${stu.mid}</a></td>
            <td>${stu.mname}</td>
            <td>${stu.mgender}</td>
            <td>${stu.mage}</td>
            <td>${stu.maddress}</td>
            <td>${stu.memail}</td>
        </tr>
    </c:forEach>
</table>
    <div id="mess">${mes}</div>
</body>
</html>
