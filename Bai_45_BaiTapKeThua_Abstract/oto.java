/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_45_BaiTapKeThua_Abstract;

/**
 *
 * @author Admin
 */
public class oto extends phuongTienDiChuyen {
    
    private String loaiNguyenLieu;

    public oto( hangSanXuat HangSanXuat , String loaiNguyenLieu) {
        super("xe oto", HangSanXuat);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }
    
   

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public double layVanToc() {
        return 60;

    }
    
}
