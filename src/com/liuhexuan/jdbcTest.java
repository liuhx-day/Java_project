package com.liuhexuan;/**
 * @Current File Name: jdbcTest.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/8 0:23
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

import java.sql.*;

/**
 * @ClassName jdbcTest
 * @Description TODO:JDBC连接MYSQL测试
 * @Author 刘赫轩
 * @Date 2021/1/8 0:23
 * @Version 1.0
 **/
public class jdbcTest {
    public static void main(String []args)throws Exception{
        // 加载数据库驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/music";
        String sql="select*from songs";
        try{
            Connection conn= DriverManager.getConnection(url,"root","");
            Statement stmt=conn.createStatement();
            ResultSet rst= stmt.executeQuery(sql);
            while (rst.next()){
                System.out.println(rst.getInt(1)+"\t"+
                        rst.getString(2)+"\t"+
                        rst.getString(3));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
        // 实现 2021/1/8 0:49
    }
}
