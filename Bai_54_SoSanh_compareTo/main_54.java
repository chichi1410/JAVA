/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_54_SoSanh_compareTo;

/**
 *
 * @author Admin
 */
public class main_54 {

    public static void main(String[] args) {
        sinhVien sv1 = new sinhVien(150, "nguyen dai hoa", "lop 14", 9);
        sinhVien sv2 = new sinhVien(100, "nhan mac qua", "lop 13", 9);
        sinhVien sv3 = new sinhVien(200, "jack", "lop 13", 9);
        sinhVien sv4 = new sinhVien(200, "nguyen dai anh", "lop 13", 9);
        
        // so sanh ma sinh vien 
//        System.out.println("so sanh sv1 va sv2 : " + sv1.compareTo(sv2)); // = 50 => sv1 lon hon sv2
//        System.out.println("so sanh sv1 va sv3 : " + sv1.compareTo(sv3)); //  -50 => sv1 nho hon sv3
        
        // so sanh ten sinh vien
        
        System.out.println("so sanh ten 1 va 2  : " + sv1.compareTo(sv2));
        System.out.println("so sanh ten 1 va 3  : " + sv1.compareTo(sv3));
        System.out.println("so sanh ten 1 va 4  : " + sv1.compareTo(sv4));
        
        System.out.println("ten sv1 sau khi cut : " + sv1.getTen());
        System.out.println("ten sv2 sau khi cut : " + sv2.getTen());
        System.out.println("ten sv3 sau khi cut : " + sv3.getTen());
        System.out.println("ten sv4 sau khi cut : " + sv4.getTen());
        
    }

}
