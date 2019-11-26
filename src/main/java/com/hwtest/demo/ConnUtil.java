package com.hwtest.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnUtil {

    public static void main(String[] args) throws Exception{


        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gkg","root","123456");
        System.out.println(conn+"链接");


    }




}
