/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_82_JavaSwing_Font_Sizetext.view;

import Bai_82_JavaSwing_Font_Sizetext.model.lastButtonModel;
import java.awt.BorderLayout;
import java.awt.Font;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class lastButtonView extends JFrame{
    private lastButtonModel lastButtonModel;
    public lastButtonView(){
        this.lastButtonModel = new lastButtonModel();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel Jpanel_Center = new JPanel();
        Jpanel_Center.setLayout(new GridLayout(2,2));
        
        
        // tao font chu
        Font font = new Font("arial", Font.BOLD, 20);
        
        JButton jbutton_1 = new JButton("1");
        jbutton_1.setFont(font);
        JButton jbutton_2 = new JButton("2");
        jbutton_2.setFont(font);
        JButton jbutton_3 = new JButton("3");
        jbutton_3.setFont(font);
        JButton jbutton_4 = new JButton("4");
        jbutton_4.setFont(font);
        
        Jpanel_Center.add(jbutton_1);
        Jpanel_Center.add(jbutton_2);
        Jpanel_Center.add(jbutton_3);
        Jpanel_Center.add(jbutton_4);
        
        JPanel Jpanel_footer = new JPanel();
        JLabel jlabel = new JLabel("code by nguyen dai hoa");
        jlabel.setFont(font);
        Jpanel_footer.add(jlabel);
        
        this.setLayout(new BorderLayout());
        this.add(Jpanel_Center , BorderLayout.CENTER);
        this.add(Jpanel_footer , BorderLayout.SOUTH);
        
        
        
        
        
        this.setVisible(true);
    }
    
}
