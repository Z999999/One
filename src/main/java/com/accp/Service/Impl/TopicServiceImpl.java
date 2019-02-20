package com.accp.Service.Impl;

import com.accp.Dao.Impl.TopicDaoImpl;
import com.accp.Dao.TopicDao;
import com.accp.Service.TopicService;
import com.accp.eneit.Topic;
import com.accp.uter.page;

import java.util.List;

/**
 * Created by zhang on 2018/12/13.
 */
public class TopicServiceImpl implements TopicService{
  TopicDao topicDao=new TopicDaoImpl();
    @Override
    public int count() {
        return topicDao.count();
    }

    @Override
    public void findpageTopic(page page) {
        int totalcount=topicDao.count();
        page.setTotalCount(totalcount);
        List<Topic> list=topicDao.getpageTopicclist(page.getCurrpage(),page.getPagesize());
        page.setTopicslist(list);
    }
}
