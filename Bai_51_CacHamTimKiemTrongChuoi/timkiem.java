/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_51_CacHamTimKiemTrongChuoi;

/**
 *
 * @author Admin
 */
public class timkiem {
    public static void main(String[] args) {
        System.out.println("--------------ham indexof-----------------");
        String s1 ="xin chao tat ca moi nguoi , xin chao";
        String s2 ="xin chao";
        String s3 ="xin chao abc";
        char c1 = 'o';
        
        System.out.println("vi tri cua s2 trong s1 la : " + s1.indexOf(s2)); // tim thay tra ve so >= 0
        System.out.println("vi tri cua s3 trong s1 la : " + s1.indexOf(s3)); // ko tim thay tra ve so < 0
        //
        //su dung vi tri bat dau
        System.out.println("-----------su dung vi tri bat dau X------------------");
        System.out.println("vi tri cua s2 bat dau tu ki tu thu 2 trong s1 la : " + s1.indexOf(s2 , 2));
        
        System.out.println("-------------tim kiem char -------------");
        System.out.println("vi tri ki tu c2 =(o) trong s1 la : " + s1.indexOf(c1));
        System.out.println("vi tri ki tu c2 =(o) bat dau tu vi tri 8 trong s1 la : " + s1.indexOf(c1 , 8));
    }
}
