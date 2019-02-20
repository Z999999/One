package cn.accp.Service.ServiceImpl;

import cn.accp.Bao.UsersDao;
import cn.accp.Bao.Impl.UsersDaoImpl;
import cn.accp.Service.UsersService;
import cn.accp.eneity.Users;

/**
 * Created by zhang on 2018/12/8.
 */
public class UsersServiceImpl implements UsersService{
        UsersDao usersDao=new UsersDaoImpl();
    @Override
    public Users longin(Users users) {
        return usersDao.longin(users);
    }
}

