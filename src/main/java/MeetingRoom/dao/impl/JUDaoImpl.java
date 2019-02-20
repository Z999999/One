package MeetingRoom.dao.impl;

import MeetingRoom.dao.BaseDao;
import MeetingRoom.dao.JUDao;
import MeetingRoom.enity.Ju;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public class JUDaoImpl extends BaseDao implements JUDao{
    @Override
    public List<Ju> selectAll() {
        List<Ju> list=new ArrayList<>();
        String sql="select mid,mname,mgender,mage,maddress,memail from membersinfo";
        getConnection();
        try {
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               Ju ju=new Ju();
                ju.setMid(rs.getInt("mid"));
                ju.setMname(rs.getString("mname"));
                ju.setMgender(rs.getString("mgender"));
                ju.setMage(rs.getInt("mage"));
                ju.setMaddress(rs.getString("maddress"));
                ju.setMemail(rs.getString("memail"));
                list.add(ju);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Ju selectById(Integer id) {
       Ju ju=new Ju();
        String sql="select mid,mname,mgender,mage,maddress,memail from membersinfo where mid=?";
        getConnection();
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                ju.setMid(rs.getInt("mid"));
                ju.setMname(rs.getString("mname"));
                ju.setMgender(rs.getString("mgender"));
                ju.setMage(rs.getInt("mage"));
                ju.setMaddress(rs.getString("maddress"));
                ju.setMemail(rs.getString("memail"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ju;
            }

    @Override
    public int update(Ju ju) {
        String sql="update membersinfo set mname=?,mgender=?,mage=?,maddress=?,memail=? where mid=?";
        Object[] objs={ju.getMname(),ju.getMgender(),ju.getMage(),ju.getMaddress(),ju.getMemail(),ju.getMid()};
        System.out.println("用户信息"+ju.getMname());
        return exceuteUpdate(sql,objs);
    }
}
