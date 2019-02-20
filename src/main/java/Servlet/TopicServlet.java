package Servlet;

import com.accp.Service.Impl.TopicServiceImpl;
import com.accp.Service.TopicService;
import com.accp.uter.page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2018/12/13.
 */
@WebServlet(name = "TopicServlet",urlPatterns = "/topic")
public class TopicServlet extends HttpServlet {
    TopicService topicService=new TopicServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*int c=topicService.count();
        response.getWriter().print(""+c);*/
        request.setCharacterEncoding("utf-8");
        String t = request.getParameter("type");
        if (t == null) {
            selByPage(request, response);
        } else {
            switch (t) {
                case "selBypage":
                    selByPage(request, response);
                    break;
            }
        }
    }
    public void selByPage (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String pageindex=request.getParameter("pageindex");
        if (pageindex==null){
            pageindex="1";
        }
        int ye=Integer.valueOf(pageindex);
        page page=new page();
        page.setCurrpage(ye);
        page.setPagesize(5);
        topicService.findpageTopic(page);
        request.getSession().setAttribute("p",page);
        response.sendRedirect("topic.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
