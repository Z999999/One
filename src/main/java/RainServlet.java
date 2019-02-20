import com.accp.Service.Impl.RainManagerServiceImpl;
import com.accp.Service.RainManageService;
import com.accp.eneit.RainManage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by zhang on 2019/1/9.
 */
@WebServlet(name = "RainServlet",urlPatterns = "/rain")
public class RainServlet extends HttpServlet {
    RainManageService rms=new RainManagerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type= request.getParameter("type");
        if(type==null || type.equals("select")){
            select(request,response);
        }else if(type.equals("add")){
            add(request,response);
        }else if(type.equals("del")){
            del(request,response);
        }
    }

    public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<RainManage> list= rms.selectAll();
        request.getSession().setAttribute("list",list);

        response.sendRedirect("Rain.jsp");
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void del(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String info=request.getParameter("id");
        if(info!=null){
            int id=Integer.valueOf(info);
            int r=rms.delete(id);
            boolean isok=false;
            if(r==1){
                isok=true;
            }
            PrintWriter out= response.getWriter();
            out.print(isok);
            out.flush();
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
