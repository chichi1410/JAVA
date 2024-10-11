/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_80_Javaswing_Mycalculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class mycalculator extends JFrame{
    public mycalculator(){
        this.setTitle("mycalculator");
        this.setSize(300 , 300);
        JTextField jTextField = new JTextField();
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField , BorderLayout.CENTER);
        
        JButton JB = new JButton("0");
        JButton JB1 = new JButton("1");
        JButton JB2 = new JButton("2");
        JButton JB3 = new JButton("3");
        JButton JB4 = new JButton("4");
        JButton JB5 = new JButton("5");
        JButton JB6 = new JButton("6");
        JButton JB7 = new JButton("7");
        JButton JB8 = new JButton("8");
        JButton JB9 = new JButton("9");
        JButton JB_cong = new JButton("+");
        JButton JB_tru = new JButton("-");
        JButton JB_nhan = new JButton("*");
        JButton JB_chia = new JButton("/");
        JButton JB_bang = new JButton("=");
        
        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(5,3));
        
        
        
        jPanel_button.add(JB);
        jPanel_button.add(JB1);
        jPanel_button.add(JB2);
        jPanel_button.add(JB3);
        jPanel_button.add(JB4);
        jPanel_button.add(JB5);
        jPanel_button.add(JB6);
        jPanel_button.add(JB7);
        jPanel_button.add(JB8);
        jPanel_button.add(JB9);
        jPanel_button.add(JB_cong);
        jPanel_button.add(JB_tru);
        jPanel_button.add(JB_nhan);
        jPanel_button.add(JB_chia);
        jPanel_button.add(JB_bang);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_head , BorderLayout.NORTH);
        this.add(jPanel_button , BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new mycalculator();
    }
    
}
