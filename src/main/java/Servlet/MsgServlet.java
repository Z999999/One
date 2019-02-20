package Servlet;

import accp.cn.Service.MsgService;
import accp.cn.Service.ServiceImpl.MsgServiceImpl;
import accp.cn.eneity.Msg;
import accp.cn.eneity.UserInfo;

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
 * Created by zhang on 2018/12/18.
 */
@WebServlet(name = "MsgServlet")
public class MsgServlet extends HttpServlet {
    MsgService msgservice=new MsgServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type= request.getParameter("type");
        switch (type){
            case "sel":
                selBysendto(request,response);
                break;
            case "byid":
                selByid(request,response);
                break;
        }
    }
    public  void selByid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,Object> obj=new HashMap<>();
        Integer id=Integer.valueOf(request.getParameter("msid"));
        obj.put("msgid",id);
        List<Msg> list= msgservice.selcteByMap(obj);
        request.setAttribute("list",list);
        request.getRequestDispatcher("reader.jsp").forward(request,response);
    }
    public void selBysendto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据登录的用户查询给此用户发邮件的信息
        Map<String,Object> obj=new HashMap<>();
        //得到登录的用户名
        UserInfo userinfo=(UserInfo)
                request.getSession().getAttribute("user");
        obj.put("sendto",userinfo.getUsername());
        List<Msg> list= msgservice.selcteByMap(obj);
        request.setAttribute("list",list);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
