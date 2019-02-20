package cn.accp.eneity;

import java.io.Serializable;

/**
 * Created by zhang on 2018/12/8.
 */
public class Users implements Serializable{
    public Users() {
        super();
    }
    public Users(Integer uid, String uname, String upwd) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
    }
    private Integer uid;
    private String uname;
    private String upwd;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpwd() {
        return upwd;
    }
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
