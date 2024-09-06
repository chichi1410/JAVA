/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_32_MyDate;

/**
 *
 * @author Admin
 */
public class test {

    public static void main(String[] args) {
        MyDate md = new MyDate(14, 10, 2004);
        System.out.println("day = " + md.getDay());
        md.setDay(31);
        System.out.println("day = " + md.getDay());
        MyDate md1 = new MyDate(15, 10, 2004);
        MyDate md2 = new MyDate(15, 11, 2099);
        System.out.println(md);
        System.out.println(md1);
        System.out.println(md2);
                
    }
}
