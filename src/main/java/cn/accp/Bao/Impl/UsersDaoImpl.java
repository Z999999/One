package cn.accp.Bao.Impl;
import java.sql.*;
import cn.accp.Bao.BaseDao;
import cn.accp.Bao.UsersDao;
import cn.accp.eneity.Users;

/**
 * Created by zhang on 2018/12/8.
 */
public class UsersDaoImpl extends BaseDao implements UsersDao{
    @Override
    public Users longin(Users users) {
        conn=getConnection();
        String  sql="select * from  news_users where uname=? and upwd=?";
        try{
            ps=conn.prepareStatement(sql);
            ps.setString(1, users.getUname());
            ps.setString(2, users.getUpwd());
            rs=ps.executeQuery();
            while(rs.next()){
                users.setUid(rs.getInt("uid"));
                users.setUname(rs.getString("uname"));
                users.setUpwd(rs.getString("upwd"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Coll();
        }
        return users;
    }
}
