package cn.accp.eneity;

import java.io.Serializable;

/**
 * Created by zhang on 2018/12/10.
 */
public class Cha implements Serializable{
    private Integer tId;
    private String tName;

    public Cha(Integer tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public Cha() {
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
