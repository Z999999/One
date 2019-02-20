package cn.accp.Bao.Impl;

import cn.accp.Bao.BaseDao;
import cn.accp.Bao.ChaDao;
import cn.accp.eneity.Cha;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2018/12/10.
 */
public class ChaDaoImpl extends BaseDao implements ChaDao{
    @Override
    public List<Cha> selectAll() {
        List<Cha> list=new ArrayList<>();
        conn=getConnection();
        String sql="select*from topic";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Cha cha=new Cha();
                cha.settId(rs.getInt("tId"));
                cha.settName(rs.getString("tName"));
                list.add(cha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int add(Cha cha) {
        String sql="insert into topic values(null,?)";
        Object[] object={cha.gettName()};
        return exceuteUpdate(sql,object);
    }

    @Override
    public Cha selectbyid(Integer id) {
        Cha cha=new Cha();
        conn=getConnection();
        String sql="select*from topic where tid=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            if(rs.next()){
            cha.settId(rs.getInt("tid"));
            cha.settName(rs.getString("tname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Coll();
        }
        return cha;
    }

    @Override
    public int updata(Cha cha) {
        String sql="update  topic set tname=? where tid=?";
        Object[] objects={cha.gettName(),cha.gettId()};
        return exceuteUpdate(sql,objects);
    }

    @Override
    public int delete(Integer id) {
        String sql="delete from topic where tid=?";
        Object[]  objects={id};
        return exceuteUpdate(sql,objects);
    }
}
