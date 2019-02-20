package com.accp.Dao.Impl;

import com.accp.Dao.BaseDao;
import com.accp.Dao.RainManagerDao;
import com.accp.eneit.RainManage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/9.
 */
public class RainManagerDaoImpl extends BaseDao implements RainManagerDao{
    @Override
    public List<RainManage> selectAll() {
        List<RainManage> list=new ArrayList<>();
        getConnection();
        String sql=" select * from rainQuality";
        try {
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                RainManage rainManage = new RainManage();
                rainManage.setId(rs.getInt("id"));
                rainManage.setDestrictName(rs.getString("destrictName"));
                rainManage.setMonitoringAddress(rs.getString("monitoringAddress"));
                rainManage.setMonitoringStation(rs.getString("monitoringStation"));
                rainManage.setMonitorTime(rs.getDate("monitorTime"));
                rainManage.setRain(rs.getInt("rain"));
                list.add(rainManage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Integer add(RainManage rm) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        String sql="delete from rainQuality where id=?";
        Object[] obj={id};
        return exceuteUpdate(sql,obj);
    }
}
