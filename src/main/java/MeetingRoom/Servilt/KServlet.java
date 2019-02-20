package MeetingRoom.Servilt;

import MeetingRoom.Service.Impl.KServiceImpl;
import MeetingRoom.Service.KService;
import MeetingRoom.enity.Hui;
import MeetingRoom.enity.K;

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
 * Created by zhang on 2019/1/19.
 */
@WebServlet(name = "KServlet",urlPatterns = "/k")
public class KServlet extends HttpServlet {
    KService kService=new KServiceImpl();
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
        List<K> list= kService.selectAll();
        request.getSession().setAttribute("list",list);
        response.sendRedirect("ks.jsp");
    }
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        PrintWriter out= response.getWriter();
        K cha=new K();
        cha.setEmpname(request.getParameter("xiala"));
        cha.setDept(request.getParameter("shen"));
        cha.setChkdate(Date.valueOf(request.getParameter("riqi")));
        cha.setStatus(request.getParameter("ss"));
        int x= kService.add(cha);
        if (x==1){
            out.print("<script type=\"text/javascript\">alert(\"添加成功\");window.location.href='ks.jsp'</script>");
            out.flush();
            out.close();
        }else{
            response.sendRedirect("k.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
