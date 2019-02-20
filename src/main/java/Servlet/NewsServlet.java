package Servlet;

import cn.accp.Service.ChaService;
import cn.accp.Service.NewsService;
import cn.accp.Service.ServiceImpl.ChaServiceImpl;
import cn.accp.Service.ServiceImpl.NewsServiceImpl;
import cn.accp.eneity.Cha;
import cn.accp.eneity.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhang on 2018/12/12.
 */
@WebServlet(name = "NewsServlet",urlPatterns = "/news")
public class NewsServlet extends HttpServlet {
    NewsService newsService=new NewsServiceImpl();
    ChaService chaService=new ChaServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String t = request.getParameter("type");
        if (t == null || t == "") {
            selectAll(request, response);
        } else {
            switch (t) {
                case "cha":
                    selectAll(request, response);
                    break;
            }
        }
    }
    protected void selectAll (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<News> list=newsService.selectAll();
        request.getSession().setAttribute("list",list);
        List<Cha> chaList=chaService.selectAll();
        request.getSession().setAttribute("tt",chaList);
        response.sendRedirect("news.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
