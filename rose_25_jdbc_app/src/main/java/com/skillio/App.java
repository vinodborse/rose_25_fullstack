package com.skillio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url ="jdbc:mysql://127.0.0.1:3306/rose_db";
        String username = "root";
        String password = "root";
        
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement st = connection.createStatement();
        ResultSet rs =  st.executeQuery("SELECT * FROM student");
        //------------------
        while(rs.next()) {
            System.out.println("Name:- "+ rs.getString("name") + " | Address:- "+rs.getString("address"));        	
        }

        //------------------
        connection.close();
    }
}

//rollno   name   address
//0	     1		2

/*
mobile ---> mysql connector
number ---> url, username, password
call   ---> connection 
statement ---> createStatement();
speak	---> "SELECT * FROM student;"
response ---> ResultSet
extra work
cut  ---> close
*/