<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/1/10
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="Jquery/jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                "url":"grade",
                "type":"GET",
                "data":"",
                "dataType":"json",
                "success":gradelist
            });
            function gradelist(data) {
                //alert(data);
                for(var i=0;i<data.length;i++){
                    $("#gradeinfo").append("<tr><td>"+data[i].gradeid+"</td>" +
                        "<td>"+data[i].gradename+"</td></tr>");
                }
            }
        })
    </script>
</head>
<body>
   <table id="gradeinfo">

   </table>
</body>
</html>
