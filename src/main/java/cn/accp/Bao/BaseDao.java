package cn.accp.Bao;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/**
 * Created by zhang on 2018/12/8.
 */
public class BaseDao {
    private static String dri="";
    private static String url="";
    private static String name="";
    private static String pass="";

    public Connection conn=null;
    public PreparedStatement ps=null;
    public ResultSet rs=null;

    static {
        try {
            Properties  p=new Properties();
            InputStream is= BaseDao.class.getClassLoader().getResourceAsStream("DateBase.properties");
            p.load(is);
            dri=p.getProperty("dri");
            url=p.getProperty("url");
            name=p.getProperty("name");
            pass=p.getProperty("pass");
            Class.forName(dri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        //if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, name, pass);

            } catch (SQLException e) {
                e.printStackTrace();
            }
       // }
        return conn;
    }

    public void Coll(){
        try {
            if (conn!=null) {
                conn.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int exceuteUpdate(String sql,Object[] param){
        int num=0;
        conn=getConnection();
        try {
            ps=conn.prepareStatement(sql);
            if(param!=null){
                for (int i=0;i<param.length;i++){
                    ps.setObject(i+1,param[i]);
                }
            }
            num=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Coll();
        }
        return  num;
    }
}
