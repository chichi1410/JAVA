/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLySinhVien;

/**
 *
 * @author Admin
 */
public class main_Bai_37 {

    public static void main(String[] args) {
        ngay ngay1 = new ngay(14, 10, 2004);
        ngay ngay2 = new ngay(14, 10, 2004);
        ngay ngay3 = new ngay(16, 11, 2024);

        classs lop1 = new classs("k29 cnpm", "khoa hoc may tinh");
        classs lop2 = new classs("k29 dulich", "du lich");
        classs lop3 = new classs("k29 tkdh", "khoa hoc may tinh");

        sinhVien sinhVien1 = new sinhVien("001", "nguyen dai hoa", 9.0, lop1, ngay1);
        sinhVien sinhVien2 = new sinhVien("002", "nhan mac qua", 4.5, lop2, ngay2);
        sinhVien sinhVien3 = new sinhVien("003", "tu khuyet", 8.2, lop3, ngay3);

        // bai tap lay ten khoa va lay ten sinh vien
        // bai tap kiem tra thi dat hay k
        System.out.println("thi duoi 5 diem = rot , tren 5 = dau");

        System.out.println("name: " + sinhVien1.layTenSinhVien() + "| khoa:" + sinhVien1.layTenKhoa() + "\n"
                + "kiem tra thi dat: " + sinhVien1.kiemTraThiDat());
        System.out.println("----------------------------------------------------------");
        System.out.println("name: " + sinhVien2.layTenSinhVien() + "| khoa:" + sinhVien2.layTenKhoa() + "\n"
                + "kiem tra thi dat: " + sinhVien2.kiemTraThiDat());
        System.out.println("----------------------------------------------------------");
        System.out.println("name: " + sinhVien3.layTenSinhVien() + "| khoa:" + sinhVien3.layTenKhoa() + "\n"
                + "kiem tra thi dat: " + sinhVien3.kiemTraThiDat());
        System.out.println("----------------------------------------------------------");
        // bai tap kiem tra cung ngay sinh
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("kiem tra sv 1 va 2 :" + sinhVien1.kiemTraCungNgaySinh(sinhVien2));
        if (sinhVien1.kiemTraCungNgaySinh(sinhVien2) == true) {
            System.out.println("cung ngay sinh");
        } else {
            System.out.println("khac ngay sinh");
        }
        System.out.println("kiem tra sv 1 va 3 :" + sinhVien1.kiemTraCungNgaySinh(sinhVien3));
        if (sinhVien1.kiemTraCungNgaySinh(sinhVien3) == true) {
            System.out.println("cung ngay sinh");
        } else {
            System.out.println("khac ngay sinh");
        }

    }

}
