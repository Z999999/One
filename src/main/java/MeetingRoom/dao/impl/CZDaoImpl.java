package MeetingRoom.dao.impl;

import MeetingRoom.dao.BaseDao;
import MeetingRoom.dao.CZDao;
import MeetingRoom.enity.Hui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/15.
 */
public class CZDaoImpl extends BaseDao implements CZDao {
    @Override
    public List<Hui> selectAll() {
        List<Hui> list=new ArrayList<>();
        getConnection();
        String sql="select*from  MEETINGROOM";
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Hui cha=new Hui();
                cha.setId(rs.getInt("Id"));
                cha.setMeeting_name(rs.getString("Meeting_name"));
                cha.setMeeting_order(rs.getDate("Meeting_order"));
                cha.setAdvance_name(rs.getString("Advance_name"));
                list.add(cha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int add(Hui hui) {
        conn = getConnection();
        String sql = "insert into meetingroom(meeting_name,advance_name,meeting_order) values(?,?,?)";
        Object[] objects = {
                hui.getAdvance_name(),
                hui.getMeeting_name(),
                hui.getMeeting_order()
        };
        return exceuteUpdate(sql, objects);
    }
}
