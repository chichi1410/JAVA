/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_56_PhanTachChuoiThanhMang;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class phantach {
    public static void main(String[] args) {
        String s1 = "xin chao, toi la nguyen dai hoa. toi 20 tuoi";
        // cat chuoi thanh mang tai dau cach
        String[] a = s1.split(" ");
        System.out.println("chuoi sau khi cat thanh mang tai space : " + Arrays.toString(a));
        // cat chuoi thanh mang tai dau ,
        String[] b = s1.split(",");
        System.out.println("chuoi sau khi cat thanh mang tai , : " + Arrays.toString(b) );
        //  cat chuoi tai dau , va dau .
        String[] c = s1.split("\\.|\\,");
        System.out.println("sau khi cat tai dau , va . :" + Arrays.toString(c));
        
        // cat ten ra khoi ho va ten
        String s2 = "nguyen dai hoa";
        String[] d = s2.split(" ");
        System.out.println("s2 = : " + Arrays.toString(d));
        System.out.println("ten : " + d[d.length-1]);
        
    }
}
