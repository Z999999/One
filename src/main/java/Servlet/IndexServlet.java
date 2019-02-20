package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import cn.accp.Service.ServiceImpl.UsersServiceImpl;
import cn.accp.eneity.*;
import cn.accp.Service.*;
/**
 * Created by zhang on 2018/12/6.
 */
@WebServlet(name = "IndexServlet",urlPatterns = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String  name=request.getParameter("name");
        String  pwd=request.getParameter("pwd");

        Users  users=new Users();
        users.setUname(name);
        users.setUpwd(pwd);

        UsersService usersservice=new UsersServiceImpl();
        users=usersservice.longin(users);

        if(users.getUid()==null){
            request.setAttribute("message", "登陆失败");
            response.sendRedirect("Two.jsp");
        }else{
            response.sendRedirect("One.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
