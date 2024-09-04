/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thay_TITV;

/**
 *
 * @author Admin
 */
public class Bai_31_HoaDonCafe {
    
    private String tenCafe;
    private double giaTien;
    private double khoiLuong;
    public Bai_31_HoaDonCafe(){
     
}
    
    public Bai_31_HoaDonCafe( String tenCafe , double giaTien , double khoiLuong){
        this.tenCafe = tenCafe;
        this.giaTien = giaTien;
        this.khoiLuong = khoiLuong;
        
}
    public void setKhoiLuong( double khoiLuong){
        this.khoiLuong = khoiLuong;
    }
    public void xuatKhoiLuong( Bai_31_HoaDonCafe ct){
        System.out.println("ban da mua " + ct.setKhoiLuong() );
    }
    public double tongTien(){
        return this.giaTien * this.khoiLuong; 
    }

    private String setKhoiLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
