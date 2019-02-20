package com.accp.Service.Impl;

import com.accp.Dao.Impl.RainManagerDaoImpl;
import com.accp.Dao.RainManagerDao;
import com.accp.Service.RainManageService;
import com.accp.eneit.RainManage;


import java.util.List;

/**
 * Created by zhang on 2019/1/9.
 */
public class RainManagerServiceImpl implements RainManageService{
     RainManagerDao rmd=new RainManagerDaoImpl();
    @Override
    public List<RainManage> selectAll() {
        return rmd.selectAll();
    }

    @Override
    public Integer add(RainManage rm) {
        return rmd.add(rm);
    }

    @Override
    public Integer delete(Integer id) {
        return  rmd.delete(id);
    }
}
