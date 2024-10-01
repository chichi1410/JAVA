/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_62_stack_daoNguocChuoi;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        
//        stackChuoi.push("gia tri")  => gia tri dua vao stack
//        stackChuoi.pop()          => lay gia tri ra , xoa khoi stack
//        stackChuoi.peek()          => lay gia tri ra nhung khong xoa khoi chuoi
//        stackChuoi.clear()              => xoa tat ca phan tu trong stack
//        stackChuoi.contains("gia tri")  => xac dinh gia tri co ton tai trong stack k
//        stackChuoi.size

          // vd chuoi dao nguoc
          System.out.println("nhap vao chuoi : ");
          String  s = sc.nextLine();
          for(int i=0 ; i<s.length(); i++){
              stackChuoi.push(s.charAt(i)+""); // phai cong them "" de no bien thanh chuoi 
              // vi bat cu thu j + cung thanh chuoi 
          }
          System.out.println("chuoi dao nguoc");
          for(int i=0 ; i<s.length() ; i++){
              System.out.print( stackChuoi.pop());
              
          }
          System.out.println("");
          
          // chuyen he thap phan sang nhi phan
          // chia cho 2 lay du roi xep nguoc tu sau den trc
          Stack<Integer> stackSoDu= new Stack<Integer>();
          System.out.println("nhap 1 so nguyen xan doi sang nhi phan : ");
          int x = sc.nextInt();
          while(x>0){
              int soDu = x%2;
              stackSoDu.push(soDu);
              x= x/2;
          }
          System.out.print("so nhi phan la :");
          int n = stackSoDu.size();
          for(int i=0 ; i<n; i++){
              System.out.print(stackSoDu.pop());
          }
          System.out.println("");
          System.out.println("-----------------------------");
          
         
    }
}
