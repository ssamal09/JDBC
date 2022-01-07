package com.srs.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbSample {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SACCR","root","suman");
            //here sonoo is database name, root is username and suman is password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from SACCR.EMPLOYEE_TBL;");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
                        +" "+rs.getInt(4)+" "+ rs.getString(5));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}
