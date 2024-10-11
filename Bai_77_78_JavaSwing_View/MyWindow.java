/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_77_78_JavaSwing_View;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class MyWindow extends JFrame{
    public void MyWindow(){
        
    }
    public void showIt(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showIt(String tile){
        this.setTitle(tile);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showIt(String tile , int x , int y){
        this.setTitle(tile);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
//        mw.showIt();
//        mw.showIt("hello word");
        mw.showIt("hello word" , 600 , 400);
    }
}
