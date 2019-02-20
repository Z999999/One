package MeetingRoom.Service.Impl;

import MeetingRoom.Service.KService;
import MeetingRoom.dao.BaseDao;
import MeetingRoom.dao.KDao;
import MeetingRoom.dao.impl.KDaoImpl;
import MeetingRoom.enity.K;

import java.util.List;

/**
 * Created by zhang on 2019/1/19.
 */
public class KServiceImpl extends BaseDao implements KService{
    KDao kDao=new KDaoImpl();
    @Override
    public List<K> selectAll() {
        return kDao.selectAll();
    }

    @Override
    public int add(K k) {
        return kDao.add(k);
    }
}
