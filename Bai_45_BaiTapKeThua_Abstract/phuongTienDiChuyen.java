/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_45_BaiTapKeThua_Abstract;

/**
 *
 * @author Admin
 */
public abstract class phuongTienDiChuyen {
    protected String phuongTienDiChuyen;
    protected hangSanXuat HangSanXuat;

    public phuongTienDiChuyen(String phuongTienDiChuyen , hangSanXuat HangSanXuat) {
        this.phuongTienDiChuyen = phuongTienDiChuyen;
        this.HangSanXuat = HangSanXuat;
    }

    public String getPhuongTienDiChuyen() {
        return phuongTienDiChuyen;
    }

    public void setPhuongTienDiChuyen(String phuongTienDiChuyen) {
        this.phuongTienDiChuyen = phuongTienDiChuyen;
    }

    public hangSanXuat getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(hangSanXuat HangSanXuat) {
        this.HangSanXuat = HangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.HangSanXuat.getTenQuocGia();
    }
    
    public void begin(){
        System.out.println("begin...............");
    }
    public void accelerate (){
        System.out.println("accelerate..............");
    }
    public void stop(){
        System.out.println("Stoppppp ..............");
    }
    public  abstract double layVanToc();
    
}
