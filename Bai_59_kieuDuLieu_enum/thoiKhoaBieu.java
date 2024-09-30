/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_59_kieuDuLieu_enum;

/**
 *
 * @author Admin
 */
public class thoiKhoaBieu {
    private day ngay;
    private month thang;
    private String monHoc;
    
    public thoiKhoaBieu(day ngay , month thang , String monHoc){
        this.ngay = ngay;
        this.thang = thang;
        this.monHoc = monHoc;
    }

    public day getNgay() {
        return ngay;
    }

    public void setNgay(day ngay) {
        this.ngay = ngay;
    }

    public month getThang() {
        return thang;
    }

    public void setThang(month thang) {
        this.thang = thang;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "thoiKhoaBieu{" + "ngay=" + ngay + ", thang=" + thang + ", monHoc=" + monHoc + '}';
    }
    
}
