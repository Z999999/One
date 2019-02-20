package MeetingRoom.Service.Impl;

import MeetingRoom.Service.CZService;
import MeetingRoom.dao.BaseDao;
import MeetingRoom.dao.CZDao;
import MeetingRoom.dao.impl.CZDaoImpl;
import MeetingRoom.enity.Hui;

import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public class CZServiceImpl extends BaseDao implements CZService{
    CZDao czDao=new CZDaoImpl();
    @Override
    public List<Hui> selectAll() {
        return czDao.selectAll();
    }

    @Override
    public int add(Hui hui) {
        return czDao.add(hui);
    }
}
