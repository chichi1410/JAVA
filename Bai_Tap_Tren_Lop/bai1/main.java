/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop.bai1;


public class main {
    public static void main(String[] args) {
        xeMay XM = new xeMay("1234", "wave", 50, 500000, 5);
        xeOto XO = new xeOto("123", "hondapromax", 100, 1000000, 10, Boolean.TRUE);
        
        System.out.println("ten xe may : "+XM.tenXe);
        System.out.println("mua xe : " + XM.muaXe());
        System.out.println("thue xe : " + XM.thueXe(30));
        
        
        System.out.println("ten xe oto : "+XO.tenXeOto);
        System.out.println("mua xe Oto :"+XO.muaXeOto());
         XO.chonTaiXe(30);
        
        
    }
}
