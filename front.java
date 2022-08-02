/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class front implements ActionListener
{
   JFrame f;
   JLabel id,li;
   JButton b;
   
   front()
   {
       f=new JFrame("Front");
       f.setBackground(Color.red);
       f.setLayout(null);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource(""));
       Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       l1.setBounds(0,150,1360,530);
       f.add(l1);
       
       b=new JButton("LOGIN");
       b.setBackground(Color.BLACK);
       b.setForeground(Color.WHITE);
       
       b.setBounds(500,600,300,70);
       b.addActionListener(this);
       
       id = new JLabel();
       id.setBounds(0,0,1360,750);
       id.setLayout(null);
       
       JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
       lid.setBounds(80,30,1500,100);
       lid.setFont(new Font("serif",Font.PLAIN,70));
       lid.setForeground(Color.red);
       id.add(lid);
       id.add(b);
       f.add(id);
       
       f.setVisible(true);
       f.setSize(1360,750);
       f.setLocation(200,100);
       
       
       
       
   }
   public void actionPerformed(ActionEvent ae)
       {
         if(ae.getSource()==b)
         {
             f.setVisible(false);
             login l= new login();
             
             
         }
       }
   public static void main(String[] args)
   {
       front f= new front();
   }
}
