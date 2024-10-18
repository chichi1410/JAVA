/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_81_JavaSwing_MoHinh_MCV.View;

import Bai_81_JavaSwing_MoHinh_MCV.Controller.CounterListener;
import Bai_81_JavaSwing_MoHinh_MCV.Model.CounterModel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class CounterView extends JFrame{
    private CounterModel counterModel;
    private JButton jbutton_up;
    private JButton jbutton_down;
    private JButton jbutton_reset;
    private JLabel jlabel_value; // ham de lay data
    
    public CounterView(){
        this.counterModel = new CounterModel();  
        this.init(); // day la ham khoi tao
        
    }

    private void init() {
       this.setTitle("counter");
       this.setSize(300 , 300);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       // tao su kien bam nut
      
        ActionListener al = new CounterListener(this); // this chinhs la couter view chung ta dang lam viec
       
       
       jbutton_up = new JButton("UP");
       jbutton_up.addActionListener(al);
       jbutton_down = new JButton("DOWN");
       jbutton_down.addActionListener(al);
       jbutton_reset = new JButton("RESET");
       jbutton_reset.addActionListener(al);
       jlabel_value = new JLabel(this.counterModel.getValue()+"" , JLabel.CENTER);
       
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jbutton_up , BorderLayout.WEST);
        jpanel.add(jbutton_down, BorderLayout.EAST);
        jpanel.add(jbutton_reset , BorderLayout.SOUTH);
        jpanel.add(jlabel_value , BorderLayout.CENTER);
        
     
       
        this.setLayout(new BorderLayout());
        this.add(jpanel , BorderLayout.CENTER);
       this.setVisible(true);
    }
    public void increment(){
        this.counterModel.increment();
        // vd trong coutermodel dang chua gia tri = 5 khi goi incresment thi 
        //gia tri tang len 6
        this.jlabel_value.setText(this.counterModel.getValue()+"");
        // lay value tu trong model ra
    }
    public void decrement(){
        this.counterModel.decrement();
        this.jlabel_value.setText(this.counterModel.getValue()+"");
    }
    public void reset(){
        this.counterModel.reset();
        this.jlabel_value.setText(this.counterModel.getValue()+"");
    }
}
