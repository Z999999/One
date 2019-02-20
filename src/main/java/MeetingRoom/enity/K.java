package MeetingRoom.enity;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2019/1/19.
 */
public class K implements Serializable {
    private Integer id;
    private String empname;
    private String dept;
    private Date chkdate;
    private String status;

    public Date getChkdate() {
        return chkdate;
    }

    public void setChkdate(Date chkdate) {
        this.chkdate = chkdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
