package com.accp.uter;

import com.accp.eneit.Topic;

import java.util.List;

/**
 * Created by zhang on 2018/12/13.
 */
public class page {
    private int pagesize=5;
    private int currpage=1;
    private int totalCount;
    private int totalPageCount=0;
    private List<Topic> topicslist;

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
       this.totalCount = totalCount;
        if (totalCount>0){
            this.totalPageCount=totalCount%pagesize==0?
                    totalCount/pagesize:totalCount/pagesize+1;
        }
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public List<Topic> getTopicslist() {
        return topicslist;
    }

    public void setTopicslist(List<Topic> topicslist) {
        this.topicslist = topicslist;
    }
}
