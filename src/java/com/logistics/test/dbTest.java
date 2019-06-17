package com.logistics.test;

import java.sql.*;

public class dbTest {
    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/logistics","root","1234");
//            Statement sta = con.createStatement();
//            ResultSet rs = sta.executeQuery("select * from logistics.user");
//            System.out.println(rs.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String URL = "jdbc:mysql://localhost:3306/logistics";
        String USER = "root";
        String PASSWORD = "huangdi";

        //1.加载驱动程序

        //2. 获得数据库连接
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from logistics.user");
            //如果有数据，rs.next()返回true
            while(rs.next()){
                System.out.println(rs.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3.操作数据库，实现增删改查

    }
}
