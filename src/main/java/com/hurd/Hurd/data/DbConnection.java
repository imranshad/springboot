package com.hurd.Hurd.data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by shad on 9/24/17.
 */
public class DbConnection {
    public static Connection connection;
    private static final  String Driver="jdbc:mysql://localhost:3306/shad1";
    private static final  String drClass="com.mysql.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(drClass);
        connection=DriverManager.getConnection(Driver,"root","");

        return connection;
    }
}
