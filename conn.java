/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;
import java.sql.*;

public class conn 
{
    public Connection c;
    public Statement s;
    public conn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///projectems","root","");
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
