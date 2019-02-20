package MeetingRoom.Servilt;

import MeetingRoom.dao.JUDao;
import MeetingRoom.dao.impl.JUDaoImpl;
import MeetingRoom.enity.Ju;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by zhang on 2019/1/12.
 */
@WebServlet(name = "AllServlet",urlPatterns = "/all")
public class AllServlet extends HttpServlet {
    JUDao juDao=new JUDaoImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type=request.getParameter("type");
        String message="";
        if(type==null) {

        }else  if("u".equals(type)){
            Object mess= request.getAttribute("mes");
            message=mess.toString();
        }
        List<Ju> list =
                juDao.selectAll();
        request.getSession().setAttribute("mes",message);
        request.getSession().setAttribute("list", list);
        response.sendRedirect("index.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
