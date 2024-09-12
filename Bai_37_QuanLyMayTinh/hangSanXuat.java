/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLyMayTinh;

/**
 *
 * @author Admin
 */
public class hangSanXuat {
    private String tenHangSanXuat;
    private nation quocGia;

    public hangSanXuat(String tenHangSanXuat, nation quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public nation getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(nation quocGia) {
        this.quocGia = quocGia;
    }
    // lay ten quoc gia
    public String layTenQuocGia(){
        return this.quocGia.getTenQuocGia();
    }
    // lay ten hang san xuat
    public String layTenHangSanXuat(){
        return this.getTenHangSanXuat();
    }
    
}
