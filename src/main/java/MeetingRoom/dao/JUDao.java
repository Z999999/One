package MeetingRoom.dao;

import MeetingRoom.enity.Ju;
import com.accp.eneit.StudentInfo;

import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public interface JUDao {
    List<Ju> selectAll();
    Ju selectById(Integer id);
    int update(Ju ju);
}
