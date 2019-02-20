package com.accp.Dao;

import com.accp.eneit.RainManage;

import java.util.List;

/**
 * Created by zhang on 2019/1/9.
 */
public interface RainManagerDao {
    List<RainManage> selectAll();
    Integer add(RainManage rm);
    Integer delete(Integer id);
}
