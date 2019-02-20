package MeetingRoom.dao.impl;

import MeetingRoom.dao.BaseDao;
import MeetingRoom.dao.KDao;
import MeetingRoom.enity.K;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/19.
 */
public class KDaoImpl extends BaseDao implements KDao{
    @Override
    public List<K> selectAll() {
        List<K> list=new ArrayList<>();
        getConnection();
        String sql="select*from  ATTENCE";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                K cha=new K();
                cha.setId(rs.getInt("Id"));
                cha.setEmpname(rs.getString("empname"));
                cha.setDept(rs.getString("dept"));
                cha.setChkdate(rs.getDate("chkdate"));
                cha.setStatus(rs.getString("status"));
                list.add(cha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int add(K k) {
        conn = getConnection();
        String sql = "insert into ATTENCE(empname,dept,chkdate,status) values(?,?,?,?)";
        Object[] objects = {
                k.getEmpname(),
                k.getDept(),
                k.getChkdate(),
                k.getStatus()
        };
        return exceuteUpdate(sql, objects);
    }
}
