package accp.cn.Dao;

import accp.cn.eneity.UserInfo;

import java.util.List;

/**
 * Created by zhang on 2018/12/15.
 */
public interface UserInfoDao {
    int add(UserInfo userInfo);
    List<UserInfo> selectAll();
    int login(UserInfo userInfo);
}
