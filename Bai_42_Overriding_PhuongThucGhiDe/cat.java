/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_42_Overriding_PhuongThucGhiDe;

/**
 *
 * @author Admin
 */
public class cat extends animal{
    
    public cat( ) {
        super("con meo");
    }

    @Override
    public void makeSound() {
        System.out.println("mew mew");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }
    
    
}
