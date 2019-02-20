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

/**
 * Created by zhang on 2019/1/12.
 */
@WebServlet(name = "UpdateServlet",urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    JUDao juDao=new JUDaoImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type= request.getParameter("type");
        if(type!=null && "sel".equals(type)){
            selectByid(request,response);
        }else if(type!=null && "upd".equals(type)){
            Ju ju=new Ju();
            ju.setMname(request.getParameter("username"));
            ju.setMgender(request.getParameter("gender"));
            ju.setMemail(request.getParameter("email"));
            ju.setMage(Integer.parseInt(request.getParameter("age")));
            ju.setMaddress(request.getParameter("address"));
            ju.setMid(Integer.parseInt(request.getParameter("mid")));
            System.out.println(ju.getMgender());
            int x= juDao.update(ju);
            System.out.println(x);
            if(x!=0){
                request.setAttribute("mes","更新成功");
            }else{
                request.setAttribute("mes","更新失败");
            }
            request.getRequestDispatcher("all?type=u").forward(request,response);
        }
    }
    public  void selectByid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id=Integer.valueOf(request.getParameter("id"));
        Ju ju= juDao.selectById(id);
        request.getSession().setAttribute("info",ju);
        response.sendRedirect("date.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
