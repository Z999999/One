package accp.cn.Dao.Impl;

import accp.cn.Dao.BaseDao;
import accp.cn.Dao.MsgDao;
import accp.cn.eneity.Msg;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018/12/17.
 */
public class MsgDaoImpl extends BaseDao implements MsgDao{
    @Override
    public List<Msg> getMsg(Map<String, Object> map) {
        List<Msg> list=new ArrayList<>();
        conn=getConnection();
        Integer page_no=(Integer) map.get("page_no");//page_no第几页（页码）
        Integer pagesize=(Integer) map.get("pagesiz");//每页显示的条数
        Integer msgid=(Integer) map.get("msgid");
        String uname=(String) map.get("msgname");
        String t=(String)map.get("title");
        //.

        String se=(String) map.get("sendto");


        String sql=" select msgid,username,title,msgcontent,state,sendto,msg_create_date from msg where 1=1 ";
        if(msgid!=null){
            sql+= " and msgid="+msgid;
        }
        if(uname!=null){
            sql+=" and msgname='"+uname+"'";
        }
        if(t!=null){
            sql+=" and title='"+t+"'";
        }
        if(se!=null){
            sql+=" and sendto='"+se+"'";
        }

        if(page_no!=null && pagesize!=null){
            sql+=" limit "+(page_no-1)*pagesize+","+pagesize;
        }
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                int id= rs.getInt("msgid");
                String username=rs.getString("username");
                String title=rs.getString("title");
                String content=rs.getString("msgcontent");
                int state=rs.getInt("state");
                String sendto=rs.getString("sendto");
                Date time=rs.getDate("msg_create_date");
                Msg msg=new Msg(id,username,title,content,state,sendto,time);
                list.add(msg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addMsg(Msg msg) {
        return 0;
    }
}
