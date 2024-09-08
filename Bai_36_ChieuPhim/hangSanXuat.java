/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_36_ChieuPhim;

/**
 *
 * @author Admin
 */
public class hangSanXuat {
    private String tenHangSanXuat , quocGia;
    
    public hangSanXuat(String tenHangSanXuat , String quocGia){
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }
    public String getTenHangSanXuat(){
        return tenHangSanXuat;
        
    }
    public void setTenHangSanXuat(String tenHangSanXuat){
        this.tenHangSanXuat = tenHangSanXuat;
    }
    public String getQuocGia(){
        return quocGia;
    }
    public void setQuocGia(String quocGia){
        this.quocGia = quocGia;
    }
}
