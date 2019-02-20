package accp.cn.Service.ServiceImpl;

import accp.cn.Dao.Impl.UserInfoDaoImpl;
import accp.cn.Dao.UserInfoDao;
import accp.cn.Service.UserInfoService;
import accp.cn.eneity.UserInfo;

import java.util.List;


/**
 * Created by zhang on 2018/12/15.
 */
public class UserInfoServiceImpl implements UserInfoService {
    UserInfoDao userInfoDao = new UserInfoDaoImpl();

    @Override
    public int add(UserInfo userInfo) {
        return userInfoDao.add(userInfo);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoDao.selectAll();
    }

    @Override
    public boolean login(UserInfo userInfo) {
        if (userInfoDao.login(userInfo) == 0) {
            return false;
        } else {
            return true;
        }
    }
}

