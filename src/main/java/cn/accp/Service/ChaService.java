package cn.accp.Service;

import cn.accp.eneity.Cha;

import java.util.List;

/**
 * Created by zhang on 2018/12/10.
 */
public interface ChaService {
    List<Cha> selectAll();
    int add(Cha cha);
    Cha selectbyid(Integer id);
    int updata(Cha cha);
    int delete(Integer id);
}
