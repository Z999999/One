package MeetingRoom.Service;

import MeetingRoom.enity.Hui;

import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public interface CZService {
    List<Hui> selectAll();
    int add(Hui hui);
}
