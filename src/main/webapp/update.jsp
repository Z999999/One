<%@ page import="cn.accp.eneity.Cha" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/11
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>

     <from action="select"  method="post">
         <input type="hidden" name="type" value="up">
         <input type="hidden" name="id" value="${t.tId}">
         编号<label >${t.tId}</label>
         名称<input type="text" name="tname" value="${t.tName}">
        <input type="submit" value="修改">
     </from>

   <%-- <%
        Cha cha=(Cha) session.getAttribute("t");
    %>
    <from action="select"  method="post">
        <input type="hidden" name="type" value="up">
        <input type="hidden" name="id" value="<%=cha.gettId()%>">
        编号<label ><%=cha.gettId()%></label>
        名称<input type="text" name="tname" value="<%=cha.gettName()%>">
        <input type="submit" value="修改">
    </from>--%>
</body>
</html>
