package com.testwork.demo.DAO;


import com.mysql.jdbc.Connection;
import com.testwork.demo.Connect;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class Model {
        private Vector<String> vector;


        public Model() {
           vector = createVector();// устаревшая коллекция
        }

        public Vector<String> createVector() {
            vector = new Vector<>();


            try {
                Connection connection = Connect.getConnection();

                Statement statement = connection.createStatement();

                String sqlSelect = "SELECT * FROM names";

                ResultSet resSet = statement.executeQuery(sqlSelect);

                while (resSet.next()) {
                    int id = resSet.getInt(1);
                    String name = resSet.getString(2);
                    vector.add(name);
                }
                if(!connection.isClosed())
                    System.out.println("Connected");

                connection.close();
            }
            catch (Exception e){
                System.out.println(e);
            }

            return vector;
        }


        public void setName(String name){
            //vector.add(name);

            try {
                Connection connection = Connect.getConnection();

                Statement statement = connection.createStatement();

                String sqlInsert = "INSERT INTO names (name) VALUES ('" + name + "')" ;

                statement.executeUpdate(sqlInsert);

                connection.close();
            }
            catch (Exception e){
                System.out.println(e);
            }

        }

}
