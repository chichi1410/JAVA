/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_79_JavaSwing_Layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class VD_FlowLayout extends JFrame{
    public  VD_FlowLayout(){
        this.setTitle("folowLayout");
        this.setSize(600 , 400);
        this.setLocationRelativeTo(null);// can giua
        
        //set layout
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        
        //set button
        JButton JB1 = new JButton("button 1");
        JButton JB2 = new JButton("button 2");
        JButton JB3 = new JButton("button 3");
        
        // add thanh phan
        this.add(JB1);
        this.add(JB2);
        this.add(JB3);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
         new VD_FlowLayout();
        
    }
}
