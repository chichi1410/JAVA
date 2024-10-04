/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_66_Generic;

/**
 *
 * @author Admin
 */
public class main_testBox2 {
    public static void main(String[] args) {
        box2 b2 = new box2<String>("hello word");
        System.out.println("xuat box2 kieu string :" + b2.getValue());
        
        box2 b3 = new box2<Integer>(15);
        System.out.println("so nguyen : " + b3.getValue());
        
        box2 b4 = new box2<Double>(15.5);
        System.out.println("so thuc : " + b4.getValue());
    }
}
