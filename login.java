/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


 class login implements ActionListener
 {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    
    login()
    {
        f= new JFrame("Login");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);
        
        p1 = new JPasswordField();
        p1.setBounds(150,70,150,30);
        f.add(p1);
        
        try{ImageIcon i1 = new ImageIcon(getClass().getResource("C:\\Users\\hp\\Documents\\NetBeansProjects\\Employeemanagementsystem\\src\\main\\java\\icons\\login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        f.add(l3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        b1 = new JButton(" Sign In");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);
       
         b2= new JButton("{Cancel");
         b2.setBounds(180,140,120,30);
         b2.setFont(new Font("serif",Font.BOLD,15));
         b2.addActionListener(this);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         f.add(b2);
         
         f.getContentPane().setBackground(Color.WHITE);
         f.setVisible(true);
         f.setSize(600,300);
         f.setLocation(400,300);
    }
    public void actionPerformed(ActionEvent ae)
    {
       try{
           conn c1 = new conn();
           String u = t1.getText();
           String v = p1.getText();
           System.out.println(v);
           String q = "select * from login where username='"+u+"' and password = '"+v+"' ";
           ResultSet rs = c1.s.executeQuery(q);
           if(rs.next())
                   {
                       f.setVisible(false);
                       new details();
                    
                    
                   }else
                  {
                     JOptionPane.showMessageDialog(null, "Invail login");
                     f.setVisible(true);
                     
                   }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    /*
    public static void main(String[] args)
    {
        login l= new login(); 
    }
*/
}
