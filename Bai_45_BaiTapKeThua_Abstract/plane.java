/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_45_BaiTapKeThua_Abstract;

/**
 *
 * @author Admin
 */
public class plane extends phuongTienDiChuyen{
    private String loaiNguyenLieu;

    public plane( hangSanXuat HangSanXuat , String loaiNguyenLieu) {
        super("planae", HangSanXuat);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

   

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

   
    
    public void catCanh(){
        System.out.println("cat canh ");
    }
    public void haCanh(){
        System.out.println("ha canh");
    }

    @Override
    public double layVanToc() {
        return 1000;
    }
    
}
