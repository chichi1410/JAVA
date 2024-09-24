/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_55_TimKiemSapXepCopy_Mang;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class bai55 {
    public static void main(String[] args) {
        int a[] = new int[] {1,3,5,7,4,9};
        int b[] = new int[15];       // xuat mang bang arrays.tostring
        System.out.println("mang ban dau : " + Arrays.toString(a));
        // sap xep mang tu be den lon Arrays.sort(a)
        Arrays.sort(a);
        // sau khi sap xep 
        System.out.println("sau khi sap xep : " + Arrays.toString(a));
        
        // ham tim kiem Arrays.binarySearch
        // phai sap xep trc khi tim kiem thi ket qua moi chinh xac
        
        System.out.println("tim kiem so 4 o vi tri : " + Arrays.binarySearch(a, 4));
        System.out.println("tim kiem so 6 o vi tri : " + Arrays.binarySearch(a, 6));
        
        // ham dien gia tri 
        Arrays.fill(b, 15);
        System.out.println("mang b sau khi dien  : " + Arrays.toString(b));
    }
}
