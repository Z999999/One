package cn.accp.Test;

import cn.accp.Service.ServiceImpl.UsersServiceImpl;
import cn.accp.Service.UsersService;
import cn.accp.eneity.Users;

/**
 * Created by zhang on 2018/12/8.
 */
public class test {
    public static void main(String[] args) {
        Users users=new Users();
        users.setUname("admin");
        users.setUpwd("admin");
        UsersService usersService=new UsersServiceImpl();
        users=usersService.longin(users);
        if (users.getUid()==null){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
