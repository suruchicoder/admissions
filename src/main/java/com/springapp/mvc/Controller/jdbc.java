package com.springapp.mvc.Controller;

import java.sql.*;
//http://www.codejava.net/frameworks/spring/spring-mvc-with-jdbctemplate-example
/**
 * Created with IntelliJ IDEA.
 * User: suruchi
 * Date: 8/1/15
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class jdbc {

        // JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/EMP";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "poi000poi";
   static  Connection conn = null;

     static {
            try{
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

//                conn.close();
            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }finally{
                //finally block used to close resources
//                try{
////                    if(stmt!=null)
////                        stmt.close();
//                }catch(SQLException se2){
//                }// nothing we can do
//                try{
//                    if(conn!=null)
//                        conn.close();
//                }catch(SQLException se){
//                    se.printStackTrace();
//                }//end finally try
            }//end try
//           System.out.println("Goodbye!");
        }//end main

    public static void addEmployee(String firstname,String lastname,String email)throws SQLException {

        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        Statement stmt = null;
        stmt =conn.createStatement();
        String sql = "INSERT INTO songs (firstname, lastname, email)" + "VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.setString(3, email);
        preparedStatement.executeUpdate();

        //STEP 6: Clean-up environment
        preparedStatement.close();
        stmt.close();
       // stmt.close();
        //conne.close();
    }

}//end FirstExample
