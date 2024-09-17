/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLyMayTinh;

/**
 *
 * @author Admin
 */
public class computer {

    private hangSanXuat HangSanXuat;
    private day ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;
    //

    public computer(hangSanXuat HangSanXuat, day ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
        this.HangSanXuat = HangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public hangSanXuat getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(hangSanXuat HangSanXuat) {
        this.HangSanXuat = HangSanXuat;
    }

    public day getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(day ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    // kiem tra gia thap hon
    public boolean kiemTraGiaThapHon(computer MTKhac) {
        return this.giaBan < MTKhac.giaBan;
    }

}
