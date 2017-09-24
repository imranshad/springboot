package com.hurd.Hurd.data;


import com.mysql.jdbc.log.Log;

import java.sql.*;

/**
 * Created by shad on 9/23/17.
 */
//@Entity
//@Table(name = "Person")
public class Person {

    private DbConnection dbConnection;
    public ResultSet resultSet;
    private Statement statement;
    final String SQLSELECTALL="SELECT * FROM shad1";
    public Connection connection;


    public Person() throws SQLException, ClassNotFoundException {
        connection=DbConnection.getConnection();
        statement=connection.createStatement();
    resultSet=statement.executeQuery(SQLSELECTALL);
    resultSet.next();
    }

    public Person(String name, String email)  {
        this.name = name;
        this.email = email;

    }

    public int getID() {

        return ID;

    }

    public void setID(int ID) throws SQLException {

        ID = Integer.parseInt(resultSet.getNString(1));
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws SQLException {
         name=(resultSet.getString(2).toString());
        this.name = name;
    }

    public String getEmail() throws SQLException {
        email=(resultSet.getString(3).toString());
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean ConnectionClose() throws SQLException {
        connection.close();
        return true;
    }
    public String ConnectionStatus(){

        return connection.toString();
    }
   // @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int ID;
    //@Column(name = "name")
    private String name;
    //@Column(name = "email")
    private String email;

}
