package MeetingRoom.Servilt;

import MeetingRoom.Service.CZService;
import MeetingRoom.Service.Impl.CZServiceImpl;
import MeetingRoom.dao.impl.CZDaoImpl;
import MeetingRoom.enity.Hui;
import cn.accp.eneity.Cha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
@WebServlet(name = "CZServlet",urlPatterns = "/cz")
public class CZServlet extends HttpServlet {
    CZService czService=new CZServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String type=request.getParameter("type");
        if (type==null) {
            sel(request, response);
        }else {
            switch (type) {
                case "sel":
                    sel(request, response);
                    break;
                case "add":
                    add(request, response);
                    break;
            }
        }
    }
    protected void sel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Hui> list= czService.selectAll();
        request.getSession().setAttribute("list",list);
        response.sendRedirect("cz.jsp");
    }
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        PrintWriter out= response.getWriter();
        Hui cha=new Hui();
        cha.setAdvance_name(request.getParameter("xiala"));
        cha.setMeeting_name(request.getParameter("shen"));
        cha.setMeeting_order(Date.valueOf(request.getParameter("riqi")));
        int x= czService.add(cha);
        if (x==1){
            out.print("<script type=\"text/javascript\">alert(\"添加成功\");window.location.href='cz.jsp'</script>");
            out.flush();
            out.close();
        }else{
            response.sendRedirect("czadd.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
