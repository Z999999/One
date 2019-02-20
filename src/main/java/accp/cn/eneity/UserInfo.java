package accp.cn.eneity;

import java.io.Serializable;

/**
 * Created by zhang on 2018/12/15.
 */
public class UserInfo implements Serializable{
    public UserInfo() {

    }

    public UserInfo(String username, String password, String emai) {
        this.username = username;
        this.password = password;
        this.emai = emai;
    }

    private String username;
    private String password;
    private String emai;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
}
