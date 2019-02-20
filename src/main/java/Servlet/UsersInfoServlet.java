package Servlet;

import accp.cn.Service.MsgService;
import accp.cn.Service.ServiceImpl.MsgServiceImpl;
import accp.cn.Service.ServiceImpl.UserInfoServiceImpl;
import accp.cn.Service.UserInfoService;
import accp.cn.eneity.Msg;
import accp.cn.eneity.UserInfo;
import cn.accp.Service.ServiceImpl.UsersServiceImpl;
import cn.accp.Service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018/12/15.
 */
@WebServlet(name = "UsersInfoServlet",urlPatterns = "/users")
public class UsersInfoServlet extends HttpServlet {
        UserInfoService userInfoService=new UserInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String t=request.getParameter("type");
        switch (t){
            case "add":

                break;
            case "update":

                break;
            case "delete":

                break;
            case "Deng":
            add(request,response);
                break;
            case "cha":

                break;
        }
    }
    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   request.setCharacterEncoding("utf-8");
    String username=request.getParameter("username");
    String pwd=request.getParameter("password");
    UserInfo userinfo=new UserInfo();
        userinfo.setUsername(username);
        userinfo.setPassword(pwd);
        if(userInfoService.login(userinfo)){
        request.getSession().setAttribute("user",userinfo);
        response.sendRedirect("msg?type=sel");
        //response.sendRedirect("list.jsp");
    }else{
        response.sendRedirect("Index.html");
    }

}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
