package com.accp.Dao;

import com.accp.eneit.StudentInfo;

import java.util.List;

/**
 * Created by zhang on 2019/1/12.
 */
public interface StudentDao {
    List<StudentInfo> selectAll();
    StudentInfo selectById(Integer id);
    int update(StudentInfo stuinfo);
}
