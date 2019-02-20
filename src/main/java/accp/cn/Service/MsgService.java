package accp.cn.Service;

import accp.cn.eneity.Msg;

import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018/12/17.
 */
public interface MsgService {
    List<Msg> selcteByMap(Map<String,Object> map);
}
