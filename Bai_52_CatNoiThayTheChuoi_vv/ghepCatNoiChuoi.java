/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_52_CatNoiThayTheChuoi_vv;

import java.awt.BorderLayout;

/**
 *
 * @author Admin
 */
public class ghepCatNoiChuoi {
    public static void main(String[] args) {
        String s1 = "hoa";
        String s2 = ".png";
        // su dung + de noi chuoi 
        System.out.println("su dung + de noi chuoi");
        String s3 = s1 + s2;
        // su dung concat de noi chuoi
        System.out.println("u dung concat de noi chuoi");
        String s4 = s1.concat(s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("----------------------------------------------------");
        
        // ham replaceAll thay the
        System.out.println("ham replaceAll thay the tu hoa.png => giu nguyen .png thay the hoa => hoadeptrai");
        String s5 = "hoa.png";
        String s6 = s5.replaceAll("hoa", "hoadeptrai");
        System.out.println("sau khi thay the : " + s6);
        System.out.println("----------------------------------------------------");
        
        // ham chuyen chu hoa sang thuong toLowerCase
        // ham chuyen chu thuong sang hoa toUpperCase
        System.out.println("ham chuyen chu hoa sang thuong toLowerCase\n"
                + "ham chuyen chu thuong sang hoa toUpperCase");
        String s7 = "nguyendaihoa";
        String s8 = "NGUYENDAIHOA";
        String s9 = s8.toLowerCase();
        String s10 = s7.toUpperCase();
        System.out.println("sau khi su dung toLowerCase : " + s9);
        System.out.println("sau khi su dung toUpperCase : " +s10);
        System.out.println("----------------------------------------------------");
        
        // xoa khoang trang du thua o dau va cuoi chuoi 
        System.out.println("xoa khoang trang du thua o dau va cuoi chuoi ");
        String s11 = "  nguyendaihoa  ";
         System.out.println("truoc khi xoa khoang trang : " + s11);
        System.out.println("sau khi xoa khoang trang : " + s11.trim());
        System.out.println("----------------------------------------------------");
        
        // cat choi con tu vi tri n tro di = ham substring(n)
        System.out.println("cat choi con tu vi tri n tro di = ham substring(n)");
        String s12 = "nguyen dai hoa";
        String s13 = s12.substring(4);
        String s14 = s12.substring(10);
        System.out.println("cat chuoi con tu vi tri thu 4 tro di : " + s13);
        System.out.println("cat chuoi con tu vi tri thu 10 tro di : " + s14);
        System.out.println("----------------------------------------------------");
     
        
    }
}
