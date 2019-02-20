package accp.cn.Dao.Impl;

import accp.cn.Dao.UserInfoDao;
import accp.cn.eneity.UserInfo;
import accp.cn.Dao.BaseDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2018/12/15.
 */
public class UserInfoDaoImpl extends BaseDao implements UserInfoDao{
    @Override
    public int add(UserInfo userInfo) {
        conn=getConnection();
        String sql="";

        return 0;
    }
    //查询
    @Override
    public List<UserInfo> selectAll() {
        List<UserInfo> list=new ArrayList<>();
        conn=getConnection();
        String sql="select username,password,email from msg_userinfo;";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                UserInfo userInfo=new UserInfo();
                userInfo.setUsername(rs.getString("username"));
                userInfo.setPassword(rs.getString("password"));
                userInfo.setEmai(rs.getString("emai"));
                list.add(userInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int login(UserInfo userInfo) {
        int count=0;
        conn=getConnection();
        String sql="select count(0) as r from msg_userinfo where username=? and password=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,userInfo.getUsername());
            ps.setString(2,userInfo.getPassword());
            rs=ps.executeQuery();
            while (rs.next()){
                count=  rs.getInt("r");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
