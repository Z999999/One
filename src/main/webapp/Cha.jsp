<%@ page import="java.util.List" %>
<%@ page import="cn.accp.eneity.Cha" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/10
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <a href="add.jsp">增加</a>
    </div>
   <%-- <%
        List<Cha> list=(List<Cha>)session.getAttribute("li");
    %>--%>
    <table border="1">
        <tr>
            <th width="100">编号</th>
            <th width="200">名称</th>
            <th width="150">操作</th>
        </tr>
     <c:forEach items="${li}" var="cha">
         <tr>
             <td>${cha.tId}</td>
             <td>${cha.tName}</td>
             <td>
                 <a href="select?type=update&id=${cha.tId}">修改</a>
                 <a href="select?type=delete&id=${cha.tId}">删除</a>
             </td>
         </tr>
     </c:forEach>
       <%-- <%
            for (Cha ch:list) {
        %>
        <tr>
            <td><%=ch.gettId()%></td>
            <td><%=ch.gettName()%></td>
            <td>
                <a href="select?type=update&id=<%=ch.gettId()%>">修改</a>
                <a href="select?type=delete&id=<%=ch.gettId()%>">删除</a>
            </td>
        </tr>
        <%
            }
        %>--%>
    </table>
</body>
</html>
