package MeetingRoom.dao;

import MeetingRoom.enity.K;

import java.util.List;

/**
 * Created by zhang on 2019/1/19.
 */
public interface KDao {
    List<K> selectAll();
    int add(K k);
}
