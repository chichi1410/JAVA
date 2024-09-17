/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLyMayTinh;

/**
 *
 * @author Admin
 */
public class nation {

    private String maQuocGia;
    private String tenQuocGia;

    public nation(String maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

}
