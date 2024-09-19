/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_45_BaiTapKeThua_Abstract;

/**
 *
 * @author Admin
 */
public class main_45 {
    public static void main(String[] args) {
        hangSanXuat hsx1 = new hangSanXuat("lambogini", "america");
        hangSanXuat hsx2 = new hangSanXuat("perari", "america");
        hangSanXuat hsx3 = new hangSanXuat("vin phat", "viet nam");
        
        phuongTienDiChuyen ptdc1 = new plane(hsx1, "xang may bay");
        phuongTienDiChuyen ptdc2 = new oto(hsx2, "xang dau oto");
        phuongTienDiChuyen ptdc3 = new bike(hsx3);
        
        System.out.println("lay hang san xuat plane : " + ptdc1.layTenHangSanXuat());
        System.out.println("lay hang san xuat oto  : " + ptdc2.layTenHangSanXuat());
        System.out.println("lay hang san xuat bike : " + ptdc3.layTenHangSanXuat());
        
        System.out.println("begin " );
        ptdc1.begin();
        ptdc2.begin();
        ptdc3.begin();
            
        System.out.println("lay van toc plane : " + ptdc1.layVanToc());
        System.out.println("lay van toc oto : " + ptdc2.layVanToc());
        System.out.println("lay van toc bike : " + ptdc3.layVanToc());
    }
}
