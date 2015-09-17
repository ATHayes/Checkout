/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 110310587
 */
//class for common database activity - namely creating and deleting tables
public class Database {
     //derby variables - dbURL can be changed if re-used in other projects - no need for a constructor
    private static String dbURL = "jdbc:derby:DATABASE;create=true;user=test;password=test";
    private static Connection conn = null;
    private static Statement stmt = null;
  
    //static methods - there's only going to be one embedded database in the project, so there's no need to instatiate
    // an instance of Database
    //creates a connection to the database
    public static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    //shuts down the connection to the database
    public static void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
         //TODO Some code here
        }

    }
    
    //createTable(MY_TABLE) creates a table named MY_TABLE
    public static void createTable(String sqlString){
        try{
            createConnection();
            stmt = conn.createStatement();
            stmt.execute(sqlString);
            stmt.close();
            //
        }
        catch(SQLException sqlExcept){
            sqlExcept.printStackTrace();
        }
    } 
    
    //createTable(MY_TABLE) deletes a table named MY_TABLE
    public static void dropTable(String table){
        try{
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("drop table " + table);
            stmt.close();
            
        }
        catch(SQLException sqlExcept){
            sqlExcept.printStackTrace();
        }
    } 
}
