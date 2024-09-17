/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLyMayTinh;

/**
 *
 * @author Admin
 */
public class main_bai37 {

    public static void main(String[] args) {
        day day1 = new day(14, 10, 2024);
        day day2 = new day(15, 10, 2024);
        day day3 = new day(15, 10, 2024);

        nation nation1 = new nation("+94", "vietnam");
        nation nation2 = new nation("+96", "china");
        nation nation3 = new nation("+1", "america");

        hangSanXuat hangSanXuat1 = new hangSanXuat("fcnguyen", nation1);
        hangSanXuat hangSanXuat2 = new hangSanXuat("tencen", nation2);
        hangSanXuat hangSanXuat3 = new hangSanXuat("lambogini", nation3);

        computer computer1 = new computer(hangSanXuat1, day1, 200000, 2);
        computer computer2 = new computer(hangSanXuat2, day2, 260000, 4);
        computer computer3 = new computer(hangSanXuat3, day3, 250000, 4);

        // so sanh gia ban may tinh 1 va 2 ; 2 va 3
        System.out.println("so sanh gia ban may tinh 1 vs 2 ; 2 vs 3");
        System.out.println("may 1 va 2 :" + computer1.kiemTraGiaThapHon(computer2));
        if (computer1.kiemTraGiaThapHon(computer2) == true) {
            System.out.println("may tinh 1 co gia ban thap hon may 2");
        } else {
            System.out.println("may tinh 1 co gia ban cao hon may 2");
        }

        System.out.println("may 2 va 3 :" + computer2.kiemTraGiaThapHon(computer3));
        if (computer2.kiemTraGiaThapHon(computer3) == true) {
            System.out.println("may tinh 2 co gia ban thap hon may 3");
        } else {
            System.out.println("may tinh 2 co gia ban cao hon may 3");
        }

        // lay ten quoc gia va hang san xuat
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("ten quoc gia : " + nation1.getTenQuocGia() + " | " + " hang san xuat: "
                + hangSanXuat1.layTenHangSanXuat());
    }

}
