/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_61_BAITAP_QuanLyDanhSachSinhVien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main_61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        danhSachSV DSSV = new danhSachSV();
        int luaChon = 0;
        do {
            System.out.println("--------------NEMU---------------");
            System.out.println("VUI LONG CHON CHUC NANG"
                    + "1: them sinh vien vao sanh sach\n"
                    + "2: in danh sach sinh vien ra man hinh\n"
                    + "3: kiem tra danh sach co rong hay khong\n"
                    + "4: lay ra so luong sinh vien trong danh sach\n"
                    + "5: lam rong sinh vien trong danh sach\n"
                    + "6: kiem tra sinh vien co ton tai trong danh sach hay k, "
                    + "dua tren msv\n"
                    + "7: xoa 1 sv ra khoi danh sach dua tren ma sv\n"
                    + "8: tim kiem sinh vien dua tren ten da nhap tu ban phim\n"
                    + "9: xuat ra danh sach sinh vien co diem tu cao den thap\n"
                    + "0: thoat chuong trinh");
            System.out.println("nhap lua chon :");
            luaChon = scanner.nextInt();
            scanner.nextLine();

//            if(luaChon == 1){
//            System.out.println("MSV : ");
//                    String MSV = scanner.nextLine();
//                    System.out.println("enter full name : ");
//                    String fullName = scanner.nextLine();
//                    System.out.println("year of birth : ");
//                    int yearOfBirth = scanner.nextInt();
//                    System.out.println("average score : ");
//                    float averageScore = scanner.nextFloat();
//                    
//                    //
//                    sinhVien sv = new sinhVien(MSV, fullName, yearOfBirth, averageScore);
//                    DSSV.addSV(sv);
//        }else if(luaChon == 6){
//            System.out.println("kiem tra sinh vien co trong danh sach ko ");
//                    System.out.println("MSV : ");
//                    String MSV = scanner.nextLine();
//                    sinhVien SV = new sinhVien(MSV);
//                    System.out.println("kiem tra : " + DSSV.kiemTraSV(SV));
//        }
            switch (luaChon) {
                case 1:
                    System.out.println("MSV : ");
                    String MSV = scanner.nextLine();
                    System.out.println("enter full name : ");
                    String fullName = scanner.nextLine();
                    System.out.println("year of birth : ");
                    int yearOfBirth = scanner.nextInt();
                    System.out.println("average score : ");
                    float averageScore = scanner.nextFloat();

                    //
                    sinhVien sv = new sinhVien(MSV, fullName, yearOfBirth, averageScore);
                    DSSV.addSV(sv);
                    break;
                case 2:
                    DSSV.inRaDSSV();
                    break;
                case 3:
                    System.out.println("kiem tra danh sach co rong k : " + DSSV.kiemTraRong());
                    break;
                case 4:
                    System.out.println("so luong sinh vien : " + DSSV.layRaSoLuongSV());
                    break;
                case 5:
                    DSSV.lamRongDanhSach();
                    System.out.println("da lam rong danh sach: ");

                    break;
                case 6:

                    System.out.println("kiem tra sinh vien co trong danh sach ko ");
                    System.out.println("MSV : ");
                    String MSV1 = scanner.nextLine();
                    sinhVien SV = new sinhVien(MSV1);
                    //   System.out.println("kiem tra : " + DSSV.kiemTraSV(SV));
                    if (DSSV.kiemTraSV(SV) == true) {
                        System.out.println("sinh vien da co trong danh sach");
                    }
                    break;
                case 7:
                    System.out.println("nhap MSV SV can xoa");
                    String xoaMSV = scanner.nextLine();
                    sinhVien SVCanXoa = new sinhVien(xoaMSV);
                    DSSV.xoaSV(SVCanXoa);
                    System.out.println("da xoa xong");

                    break;
                case 8:
                    System.out.println("nhap ten sinh vien can xoa");
                    String hoTenSV = scanner.nextLine();

                    DSSV.timKiemSV_TenSV(hoTenSV);

                    break;
                default:
                //throw new AssertionError();
            }

        } while (luaChon != 0);

    }
}

        