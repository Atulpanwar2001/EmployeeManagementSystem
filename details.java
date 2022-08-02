/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class details implements ActionListener
 {
    JFrame f;
    JButton b1,b2,b3,b4;
    JLabel l1,l2;
    
    details()
    {
        f= new JFrame(" Employee details");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(" "));
        l1.setIcon(i1);
        f.add(l1);
        /*
        l2 = new JLabel("Employee details");
        l2.setBounds(430,20,200,40);
        f.add(l2);
        */
        b1= new JButton("ADD EMPLOYEE");
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        f.add(b1);
        
        b2 =new JButton("delete Employeee");
        b2.setBounds(420,140,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15)); 
        b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        f.add(b2);
        
        b3= new JButton("View");
        b3.setBounds(530,80,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        f.add(b3);
        
        b4 = new JButton(" Update");
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        f.add(b4);
        
        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);
            
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==b1)
     {
         f.setVisible(false);
         new Add_Employee();
         
     }
     if(ae.getSource()==b3)
     {
         f.setVisible(false);
         new View_Employee();
        
     }
     if(ae.getSource()==b2)
     {
         f.setVisible(false);
         new Remove_Employee();
     }
     if(ae.getSource()==b4)
     {
         f.setVisible(false);
         new Search_Employee();
     }
    }
    /*
    public static void main(String[] arg)
    {
        details d = new details();
    }
*/
 }
