/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_49_Chuoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class doDaiChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi : ");
        String s;
        s = scanner.nextLine();
        // lay do dai cua chuoi  = ha, lenth()
        System.out.println("do dai cua chuoi la: " + s.length());
        // lay ra 1 ki tu tai vi tri  = ham charAt(vitri)
        int dodai = s.length();
        for(int i = 0 ; i<dodai ; i++){
            System.out.println("vi tri " + i +" la : " + s.charAt(i));
        }
        
        // ham getchars ( vi tri bat dau , vi tri ket thuc , mang luu du lieu
        // , vi tri bat dau luu cua mang)
        
        char[] arr = new char [5];
        s.getChars(2, 5, arr, 0); // lay tu vi tri 2 den vi tri 4 cua s , luu vao mang arr , bat dau tu vi tri 0
        //xuat
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("gia tri cua mang arr tai " + i + " la :" + arr[i]);
                
        }
        
        // getbytes lay ra bang ma 
        
    }
            
}
