package accp.cn.Service.ServiceImpl;

import accp.cn.Dao.Impl.MsgDaoImpl;
import accp.cn.Dao.MsgDao;
import accp.cn.Service.MsgService;
import accp.cn.eneity.Msg;

import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2018/12/17.
 */
public class MsgServiceImpl implements MsgService{
    MsgDao msgdao=new MsgDaoImpl();
    @Override
    public List<Msg> selcteByMap(Map<String, Object> map) {
        return msgdao.getMsg(map);
    }
}
