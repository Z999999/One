<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/19
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="Jquery/jquery-1.12.4.js">
    </script>
    <script type="text/javascript">
        $(function () {
            $("table tr:first").css("font-size","20px")
            $("table tr:first").css("background","blue")

            $("[type=submit]").click(function () {
                if($("#xiala").val()==""||$("#shen").val()=="") {
                    alert("不能为空");
                    return false;
                }
                var reg=/^\d{4}-(0?[1-9]|1[0-2])-\d{2}$/;
                var riqi= $("#riqi").val();
                if(!reg.test(riqi)){
                    alert("日期格式不正确");
                    return false;
                }
                return true;
            })
        })
    </script>
</head>
<body>
<form action="k?type=add" method="post">
    <table border="1">
        <tr>
        <td>姓名</td>
        <td colspan="1">
            <input type="text" id="xiala" name="xiala" >
        </td>
    </tr>
        <tr>
            <td>所属部门</td>
            <td colspan="2">
                <input type="text" id="shen" name="shen" >
            </td>
        </tr>
        <tr>
            <td>考勤日期</td>
            <td colspan="3">
                <input type="text" id="riqi" name="riqi" >
                日期格式是：yyyy-mm-dd</td>
        </tr>
        <tr>
            <td colspan="4">考勤状态
                <select name="ss" id="ss">
                    <option value="0">考勤类型</option>
                    <option value="1">正常</option>
                    <option value="2">迟到</option>
                    <option value="3">早退</option>
                    <option value="4">休假</option>
                    <option value="5">外出</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <input type="submit" value="登记">
                <input type="button" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
