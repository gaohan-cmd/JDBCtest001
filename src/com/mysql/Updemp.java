package com.mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Updemp {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/exam?serverTimezone=UTC";
            conn = DriverManager.getConnection(url, "root", "root");
            //获取执行对象
            st=conn.createStatement();
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入您要提高工资的员工：");
            String ename=sc.next();
            String sql="update emp set sal=sal+1000 where ename='"+ename+"'";
            int num=st.executeUpdate(sql);
            if(num>0){
                System.out.println("操作成功");
            }else{
                System.out.println("操作失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                st.close();;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

