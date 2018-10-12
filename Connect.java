package com.testwork.demo;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final  String  URL = "jdbc:mysql://localhost:3306/dbname";
    private static final  String  USER = "root";
    private static final  String PASS= "root";

    public static Connection getConnection(){
        Connection connection = null;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = (Connection) DriverManager.getConnection(URL, USER, PASS);

            if(!connection.isClosed()){
                System.out.println("work_it");
            }

        }
        catch(SQLException e){
            System.out.println(e);
        }

        return  connection;
    }

}
