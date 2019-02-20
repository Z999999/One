package com.accp.Dao.Impl;

import com.accp.Dao.BaseDao;
import com.accp.Dao.StudentDao;
import com.accp.eneit.StudentInfo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2019/1/12.
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public List<StudentInfo> selectAll() {
        List<StudentInfo> list=new ArrayList<>();
        String sql="select sid,sname,sgender,sage,saddress,semail from studentinfo";
        getConnection();
        try {
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                StudentInfo studentinfo=new StudentInfo();
                studentinfo.setSid(rs.getInt("sid"));
                studentinfo.setSaddress(rs.getString("saddress"));
                studentinfo.setSage(rs.getInt("sage"));
                studentinfo.setSemail(rs.getString("semail"));
                studentinfo.setSgender(rs.getString("sgender"));
                studentinfo.setSname(rs.getString("sname"));
                list.add(studentinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public StudentInfo selectById(Integer id) {
        StudentInfo studentinfo=new StudentInfo();
        String sql="select sid,sname,sgender,sage,saddress,semail from studentinfo where sid=?";
       getConnection();
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while (rs.next()){

                studentinfo.setSid(rs.getInt("sid"));
                studentinfo.setSaddress(rs.getString("saddress"));
                studentinfo.setSage(rs.getInt("sage"));
                studentinfo.setSemail(rs.getString("semail"));
                studentinfo.setSgender(rs.getString("sgender"));
                studentinfo.setSname(rs.getString("sname"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentinfo;
    }

    @Override
    public int update(StudentInfo stuinfo) {
        String sql="update studentinfo set sname=?,sgender=?,sage=?,saddress=?,semail=? where sid=?";
        Object[] objs={stuinfo.getSname(),stuinfo.getSgender(),stuinfo.getSage(),stuinfo.getSaddress(),stuinfo.getSemail(),stuinfo.getSid()};
        System.out.println("用户信息"+stuinfo);
        return exceuteUpdate(sql,objs);
    }
}
