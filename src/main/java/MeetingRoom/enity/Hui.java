package MeetingRoom.enity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2019/1/15.
 */
public class Hui implements Serializable{
    private Integer id;
    private String meeting_name;
    private Date  meeting_order;
    private String advance_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeeting_name() {
        return meeting_name;
    }

    public void setMeeting_name(String meeting_name) {
        this.meeting_name = meeting_name;
    }

    public Date getMeeting_order() {
        return meeting_order;
    }

    public void setMeeting_order(Date meeting_order) {
        this.meeting_order = meeting_order;
    }

    public String getAdvance_name() {
        return advance_name;
    }

    public void setAdvance_name(String advance_name) {
        this.advance_name = advance_name;
    }
}
