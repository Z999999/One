package entity;

import java.io.Serializable;

/**
 * Created by zhang on 2019/1/10.
 */
public class Grade implements Serializable{
    public Grade(Integer gradeId, String gradeName) {
        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }
    private Integer gradeId;
    private String gradeName;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
