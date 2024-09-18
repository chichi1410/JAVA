/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_42_Overriding_PhuongThucGhiDe;

/**
 *
 * @author Admin
 */
public class dog extends animal{
    
    public dog() {
        super("lu");
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }

    @Override
    public void eat() {
        System.out.println("dog an xuowng");
    }
    
}
