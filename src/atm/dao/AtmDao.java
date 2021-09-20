package atm.dao;

import atm.entity.atm;

import java.sql.*;

public class AtmDao {
    //注册
    public boolean regatm(atm a) {
        Statement st = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/exam?serverTimezone=UTC";
            conn = DriverManager.getConnection(url, "root", "root");
            String sql = "insert into atm(code,pwd,name,money) values('" + a.getCode() + "','" + a.getPwd() + "','" + a.getName() + "'," + a.getMoney() + ")";
            st = conn.createStatement();
            int num = st.executeUpdate(sql);
            if (num > 0) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn == null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
            return false;
        }
        //登录界面
        public atm loginAtm(String Code,String Pwd){
            Statement sta = null;
            Connection conn = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/exam?serverTimezone=UTC";
                conn = DriverManager.getConnection(url,"root","root");
                sta = conn.createStatement();
                String sql = "select *  from atm  where  atm_code ='"+Code+"' and atm_pwd = '"+Pwd+"'";
                rs = sta.executeQuery(sql);
                //登录  我们要求账号唯一，查出结果应该是一条数据
                if(rs.next()){
                    atm a = new  atm();
                    a.setId(rs.getInt("id"));
                    a.setCode(rs.getString("code"));
                    a.setPwd(rs.getString("pwd"));
                    a.setMoney(rs.getDouble("money"));
                    a.setName(rs.getString("name"));
                    return a;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                if(rs!=null){
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(sta!=null){
                    try {
                        sta.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }
    }

