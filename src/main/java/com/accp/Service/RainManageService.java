package com.accp.Service;

import com.accp.eneit.RainManage;

import java.util.List;

/**
 * Created by zhang on 2019/1/9.
 */
public interface RainManageService {
    List<RainManage> selectAll();
    Integer add(RainManage rm);
    Integer delete(Integer id);
}
