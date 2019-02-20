package cn.accp.Service.ServiceImpl;

import cn.accp.Bao.ChaDao;
import cn.accp.Bao.Impl.ChaDaoImpl;
import cn.accp.Service.ChaService;
import cn.accp.eneity.Cha;

import java.util.List;

/**
 * Created by zhang on 2018/12/10.
 */
public class ChaServiceImpl implements ChaService{
    ChaDao chaDao=new ChaDaoImpl();
    @Override
    public List<Cha> selectAll() {
        return chaDao.selectAll();
    }

    @Override
    public int add(Cha cha) {
        return chaDao.add(cha);
    }

    @Override
    public Cha selectbyid(Integer id) {
        return chaDao.selectbyid(id);
    }

    @Override
    public int updata(Cha cha) {
        return chaDao.updata(cha);
    }

    @Override
    public int delete(Integer id) {
        return chaDao.delete(id);
    }
}
