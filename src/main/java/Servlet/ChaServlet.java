package Servlet;

import cn.accp.Service.ChaService;
import cn.accp.Service.ServiceImpl.ChaServiceImpl;
import cn.accp.eneity.Cha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhang on 2018/12/10.
 */
@WebServlet(name = "ChaServlet",urlPatterns = "/select")
public class ChaServlet extends HttpServlet {
    ChaService chaService=new ChaServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String t=request.getParameter("type");
        switch (t){
            case "add":
                zengjia(request,response);
                break;
                case "update":
                    updata(request,response);
                    break;
            case "delete":
                delete(request,response);
                break;
            case "Cha":
                Cha(request,response);
                break;
            case "up":
                up(request,response);
                break;
        }
    }
    //删除
    private void delete (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    String id=request.getParameter("id");
    if (id!=null){
     int  x= chaService.delete(Integer.valueOf(id));
        if (x==1){
            response.sendRedirect("select?type=select");
        }else {
            response.sendRedirect("SB.jsp");
        }
    }
    }
    private void up(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        Cha cha=new Cha();
        cha.settId(Integer.valueOf(id));
        cha.settName(name);
      int  x=chaService.updata(cha);
      if (x==1){
          response.sendRedirect("select?type=select");
      }else {
          response.sendRedirect("SB.jsp");
      }
    }
    //修改
    private void updata (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    String id=request.getParameter("id");
    Cha cha=chaService.selectbyid(Integer.valueOf(id));
    request.getSession().getAttribute("t");
    response.sendRedirect("update.jsp");
    }
    //增加
        private void zengjia(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String n=request.getParameter("name");
        Cha cha=new Cha();
        cha.settName(n);
        int x=chaService.add(cha);
        if (x==1){
            response.sendRedirect("select?type=select");
        }else {
            response.sendRedirect("SB.jsp");
        }
    }
    //查询
        private void Cha(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            List<Cha>list=chaService.selectAll();
            request.getSession().setAttribute("li",list);
            response.sendRedirect("Cha.jsp");
        }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
