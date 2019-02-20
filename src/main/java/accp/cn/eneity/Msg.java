package accp.cn.eneity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2018/12/17.
 */
public class Msg implements Serializable{
    public Msg(int msgid, String username, String title, String msgcount, int state, String sendto, Date msg_create_date) {
        this.msgid = msgid;
        this.username = username;
        this.title = title;
        this.msgcount = msgcount;
        this.state = state;
        this.sendto = sendto;
        this.msg_create_date = msg_create_date;
    }

    private int msgid;
    private String username;
    private String title;
    private String msgcount;
    private int state;
    private  String sendto;
    private Date msg_create_date;

    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsgcount() {
        return msgcount;
    }

    public void setMsgcount(String msgcount) {
        this.msgcount = msgcount;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    public Date getMsg_create_date() {
        return msg_create_date;
    }

    public void setMsg_create_date(Date msg_create_date) {
        this.msg_create_date = msg_create_date;
    }
}
