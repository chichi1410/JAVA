/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_81_JavaSwing_MoHinh_MCV.Controller;

import Bai_81_JavaSwing_MoHinh_MCV.View.CounterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Admin
 */
public class CounterListener implements ActionListener{ // co san trong thu vien lien quan den nut bam
    private CounterView ctv;
    
    public CounterListener(CounterView aThis){
        this.ctv = aThis;
    }


    
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("ban da bam nut");
         // hien thi ra hanh dong up hay down 
         String src = e.getActionCommand();
         System.out.println("ban da nhan nut " + src);
         if(src.equals("UP")){
             this.ctv.increment();
         
         }else if(src.equals("DOWN")){
             this.ctv.decrement();
         }else{
             this.ctv.reset();
         }
    }
}
