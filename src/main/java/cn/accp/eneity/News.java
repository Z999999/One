package cn.accp.eneity;

import java.util.Date;

/**
 * Created by zhang on 2018/12/12.
 */
public class News {
    private int nid;
    private Cha cha;
    private String ntitle;
    private String nauthor;
    private Date ncreatedate;
    private String npicpath;
    private String ncontent;
    private Date nmodifyDate;
    private String nsummary;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public Cha getCha() {
        return cha;
    }

    public void setCha(Cha cha) {
        this.cha = cha;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    public Date getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(Date ncreatedate) {
        this.ncreatedate = ncreatedate;
    }

    public String getNpicpath() {
        return npicpath;
    }

    public void setNpicpath(String npicpath) {
        this.npicpath = npicpath;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Date getNmodifyDate() {
        return nmodifyDate;
    }

    public void setNmodifyDate(Date nmodifyDate) {
        this.nmodifyDate = nmodifyDate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }
}
