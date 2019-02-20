<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/12/19
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function aa() {
            //alert("请调用我");
            xmlHttpRequest=new XMLHttpRequest();
            xmlHttpRequest.onreadystatechange=callback;
        var  me= document.getElementById("name").value;
            var url="xml?name="+me;
        xmlHttpRequest.open("GET",url,true)
            xmlHttpRequest.send(null);
        function callback() {
            if (xmlHttpRequest.readyState==4 &&
            xmlHttpRequest.status==200){
                var du=xmlHttpRequest.responseText;
                if(du=="true"){
                    alert("此用户已注册")
                }else {
                    alert("可以使用")
                }
            }
        }
        }
    </script>
</head>
<body>
        <form action="">
          用户名: <input type="text" id="name" onblur="aa()"/>
            <div id="ramdiv"></div>
          密码:  <input type="password" name="pass"/>
            <div id="pamdiv"></div>
            <input type="submit" value="提交"/>
        </form>
</body>
</html>
