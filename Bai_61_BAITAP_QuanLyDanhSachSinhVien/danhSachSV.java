/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_61_BAITAP_QuanLyDanhSachSinhVien;

import java.util.ArrayList;

public class danhSachSV {

    private ArrayList<sinhVien> danhSach;

    public danhSachSV() {
        this.danhSach = new ArrayList<sinhVien>();
    }

    public danhSachSV(ArrayList<sinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1. them  1 sinh vien
    public void addSV(sinhVien sv) {
        this.danhSach.add(sv);
    }

    // 2. in danh sach sinh vien
    public void inRaDSSV() {
        for (sinhVien Sinhvien : danhSach) {
            System.out.println(Sinhvien); // Tên biến đã nhất quán
        }

    }
     //3. kiem tra danh sach co rong hay khong
    public boolean kiemTraRong(){
        return this.danhSach.isEmpty();
    }
    // 4.lay ra so luong sinh vien trong danh sach
    public int layRaSoLuongSV(){
        return this.danhSach.size();
    }

}
