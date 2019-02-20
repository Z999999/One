package cn.accp.Bao.Impl;

import cn.accp.Bao.BaseDao;
import cn.accp.Bao.NewsDao;
import cn.accp.eneity.Cha;
import cn.accp.eneity.News;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2018/12/12.
 */
public class NewsDaoImpl extends BaseDao implements NewsDao{
    @Override
    public List<News> selectAll() {
        List<News> list=new ArrayList<>();
        conn=getConnection();
        String sql="select nid,ntitle,nauthor,tid,tname " +
                "from news inner join topic on topic.tid=news.ntid";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                News news=new News();
                news.setNid(rs.getInt("nid"));
                Cha cha=new Cha();
                cha.settId(rs.getInt("tid"));
                cha.settName(rs.getString("tname"));
                news.setCha(cha);
                news.setNtitle(rs.getString("ntitle"));
                news.setNauthor(rs.getString("nauthor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Coll();
        }
        return list;
    }
}
