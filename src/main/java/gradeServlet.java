import entity.Grade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/10.
 */
@WebServlet(name = "gradeServlet",urlPatterns = "/grade")
public class gradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //模拟连接数据得到集合的数据
        List<Grade> list=new ArrayList<>();
        list.add(new Grade(1,"草莓班"));
        list.add(new Grade(2,"香蕉班"));
        list.add(new Grade(3,"苹果班"));

        /*request.getSession().setAttribute("list",list);
        response.sendRedirect("index.jsp");*/
        //[{"gradeid:"1","gradename":"张三"},{},{}]
        StringBuffer newJSON=new StringBuffer("[");
        for (Grade g:list) {
            newJSON.append("{\"gradeid\":"+g.getGradeId()
                    +",\"gradename\":\""+g.getGradeName()+"\"},");
        }
        String r=newJSON.substring(0,newJSON.length()-1);
        r= r+"]";
        //System.out.println(r);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();
        out.print(r);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
