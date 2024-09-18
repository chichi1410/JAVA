/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_42_Overriding_PhuongThucGhiDe;

/**
 *
 * @author Admin
 */
public class animal {
    protected String name;
   
    public animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("con nao cung phai an thoi");
    }
    public void makeSound(){
        System.out.println("con nao cung phai keu");
    }
    public void sleep(){
        System.out.println("zzzzzzzzzzzzzzzzzzz");
    }
}
