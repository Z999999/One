package MeetingRoom.dao;

import MeetingRoom.enity.Hui;

import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public interface CZDao {
    List<Hui> selectAll();
    int add(Hui hui);
}
