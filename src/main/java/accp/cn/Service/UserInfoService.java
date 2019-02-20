package accp.cn.Service;

import accp.cn.eneity.UserInfo;

import java.util.List;

/**
 * Created by zhang on 2018/12/15.
 */
public interface UserInfoService {
    int add(UserInfo userInfo);

    List<UserInfo> selectAll();
    //登陆
    boolean login(UserInfo userInfo);


}
