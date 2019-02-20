<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/9
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #dd{
            margin: 0px auto;
        }
    </style>
    <script src="Jquery/jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("table>tr:odd").css("background","red");
        });
        function aa(id) {
            if(confirm("确定要删除吗")){
                //$.get("rain","type=del&id="+id,raininfo());
                 /*$.ajax({
                    "url":"rain",
                    "type":"GET",
                    "data":"type=del&id="+id,
                    "dateType":"text",
                    "success":raininfo,
                    "error":function () {
                        alert("删除失败");
                    }
                });*/
            }
            function raininfo(data) {
                if(data=="true"){
                    alert($("#a_"+id).html());
                    $("#a_"+id).parent().remove();
                }else{
                    alert("删除失败");
                }
            }
        }
    </script>
</head>
<body>
<div id="dd">
    <table border="1">
        <tr>
            <td>序号</td>
            <td>区域名称</td>
            <td>监测时间</td>
            <td>雨量值（mm）</td>
            <td>监测站</td>
            <td>站点地址</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="rain">
            <tr>
                <td>${rain.id}</td>
                <td>${rain.destrictName}</td>
                <td>${rain.monitorTime}</td>
                <td>${rain.rain}</td>
                <td>${rain.monitoringStation}</td>
                <td>${rain.monitoringAddress}</td>
                <td id="a_${rain.id}"><a id="d" href="javascript:aa(${rain.id})">删除</a></td>
            </tr>
        </c:forEach>

    </table>
    <a href="#">新增雨量监测信息</a>
</div>
</body>
</html>
