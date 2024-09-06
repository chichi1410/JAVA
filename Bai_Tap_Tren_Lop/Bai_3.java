/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.Bai_Tap_Tren_Lop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_3 {
    public static void main(String[] args) {               
        Scanner loc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = loc.nextInt();
        while(n<0){
            System.out.println("nhap lai n:");
            n = loc.nextInt();
        }
        int s=1;
        for(int i=1;i<=n;i++){
            s*=i;
        }
        System.out.println(s);
    }
}
