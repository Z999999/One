package com.accp.eneit;
import java.util.Date;
import java.io.Serializable;

/**
 * Created by zhang on 2019/1/9.
 */
public class RainManage implements Serializable{
    private int id;
    private String destrictName;
    private Date monitorTime;
    private  int rain;
    private String monitoringStation;
    private String monitoringAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestrictName() {
        return destrictName;
    }

    public void setDestrictName(String destrictName) {
        this.destrictName = destrictName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getMonitoringAddress() {
        return monitoringAddress;
    }

    public void setMonitoringAddress(String monitoringAddress) {
        this.monitoringAddress = monitoringAddress;
    }
}
