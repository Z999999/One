package com.accp.eneit;

import java.io.Serializable;

/**
 * Created by zhang on 2018/12/13.
 */
public class Topic implements Serializable{
    private Integer tId;
    private String tName;

    public Topic(Integer tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public Topic() {
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
