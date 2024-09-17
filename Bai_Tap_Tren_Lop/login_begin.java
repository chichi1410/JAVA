/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class login_begin {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String loginUserName;
        String loginPassWord;
        String userName = "nguyendaihoa";
        String passWord = "hoadz2004";
        boolean kiemTra = false;
        do{      
        System.out.print("userName : ");
        loginUserName = scanner.nextLine();
        System.out.println("");
        System.out.print("passWord :");
        loginPassWord = scanner.nextLine();
        System.out.println("----------------------------");
        if(userName.equals(loginUserName) && loginPassWord.equals(passWord)){
            System.out.println("login successful");
            kiemTra = true;
        }else if(userName.equals(loginUserName)){
            System.out.println("password error");
            System.out.println("----------------------------");
           kiemTra = false;
        }else if(loginPassWord.equals(passWord)){
            System.out.println("userName error");
            System.out.println("----------------------------");
             kiemTra = false;
        }else{
            System.out.println("password and userName error");
            System.out.println("----------------------------");
            for(int i=0 ; ;i++){
                System.out.print(" | error sai ngu |");
            }
           //  kiemTra = false;
        }     
        }while(kiemTra == false);
        scanner.close();
    }

}
