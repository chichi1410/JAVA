/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop.bai6_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chuoi {
  public void nhapchuoi(){
       Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một chuỗi
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();

        // Đếm số ký tự trong chuỗi
        int soKiTu = chuoi.length();

        // In ra số ký tự của chuỗi
        System.out.println("Số ký tự trong chuỗi là: " + soKiTu);
       String[] tu = chuoi.trim().split("\\s+"); // "\\s+" là biểu thức chính quy để tách theo khoảng trắng
       System.out.println(tu);
  }
}
