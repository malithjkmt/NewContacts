/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mcode.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Malith
 */
public class Driver {
    public static void main(String[] args){
        try{
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts?zeroDateTimeBehavior=convertToNull", "root", "ui2130mn");
            // 2. Create statement
            Statement myStmt = myConn.createStatement();
            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("select * from person");
            // 4. Process the resultSet
            while (myRs.next()){
                System.out.println(myRs.getString(1));
            }

        }
        catch (Exception exc){
            System.out.println(exc.toString());
        }
    }
    
}
