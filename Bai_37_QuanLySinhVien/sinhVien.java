/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLySinhVien;

/**
 *
 * @author Admin
 */
public class sinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diemTrungBinh;
    private classs lop;
    private ngay ngaySinh;

    public sinhVien(String maSinhVien, String hoTen, double diemTrungBinh, classs lop, ngay ngaySinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public classs getLop() {
        return lop;
    }

    public void setLop(classs lop) {
        this.lop = lop;
    }

    public ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    // bai 1 lay ten khoa , sv
    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }
     public String layTenSinhVien(){
        return this.getHoTen();
    }
    // bai 2 kiem tra co thi dat hay k
    public boolean kiemTraThiDat(){
        return diemTrungBinh >=5;
    }
    // kiem tra cung ngay sinh
    public boolean kiemTraCungNgaySinh(sinhVien sinhVienKhac){
        return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
    }
}
