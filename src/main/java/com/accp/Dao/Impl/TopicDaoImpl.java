package com.accp.Dao.Impl;

import com.accp.Dao.BaseDao;
import com.accp.Dao.TopicDao;
import com.accp.eneit.Topic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2018/12/13.
 */
public class TopicDaoImpl extends BaseDao implements TopicDao{
    @Override
    public int count() {
        int c=0;
        conn=getConnection();
        String sql="select count(0) as r from topic";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            if (rs.next()){
                c= rs.getInt("r");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Coll();
        }
        return c;
    }

    @Override
    public List<Topic> getpageTopicclist(int pageNo, int pageSize) {
        List<Topic> list=new ArrayList<Topic>();
        conn=getConnection();
        String sql="select tid,tname from topic limit ?,?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,(pageNo-1)*pageSize);
            ps.setInt(2,pageSize);
            rs=ps.executeQuery();
            while (rs.next()){
                Topic topic=new Topic();
                topic.settId(rs.getInt("tid"));
                topic.settName(rs.getString("tname"));
                list.add(topic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
