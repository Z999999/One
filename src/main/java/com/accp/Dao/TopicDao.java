package com.accp.Dao;

import com.accp.eneit.Topic;

import java.util.List;

/**
 * Created by zhang on 2018/12/13.
 */
public interface TopicDao {
    int count();

    List<Topic> getpageTopicclist(int pageNo,int pageSize);


}
