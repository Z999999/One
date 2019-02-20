package accp.cn.Dao;

import accp.cn.eneity.Msg;

import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018/12/17.
 */
public interface MsgDao {
    public List<Msg> getMsg(Map<String,Object> map);
    int addMsg(Msg msg);
}
