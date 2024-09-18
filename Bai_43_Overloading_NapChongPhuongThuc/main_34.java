/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_43_Overloading_NapChongPhuongThuc;

// cung te nhung khac thong so truyen vao
public class main_34 {
    public static void main(String[] args) {
        myMath mm = new myMath();
        System.out.println("tim min 4 va 5 = " +mm.timMin(4, 5) );
       
          System.out.println("tim min 4.5 va 5.5 = " +mm.timMin(4.5, 5.5) );
        
        System.out.println("tong 4 va 5 = " +mm.tinhTong( 4,5) );
        double arr[] = new double[] {5,5,4};
        System.out.println("tong arr[5,5,4] = " +mm.tinhTong(arr) );
        
        
    }
    
}
