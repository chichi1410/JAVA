/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_42_Overriding_PhuongThucGhiDe;

/**
 *
 * @author Admin
 */
public class main_42 {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.sleep();
        d.makeSound();
        
        cat c = new cat();
        c.eat();
        c.makeSound();
        c.sleep();
    }
}
