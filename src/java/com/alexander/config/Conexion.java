package com.alexander.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://root:vft1Sn7O7WdMBlmY4vbX@containers-us-west-11.railway.app:8072/railway";
    String user="root";
    String pass="vft1Sn7O7WdMBlmY4vbX";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
