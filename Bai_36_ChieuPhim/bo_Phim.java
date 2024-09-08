/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_36_ChieuPhim;

/**
 *
 * @author Admin
 */
public class bo_Phim {
    private String movieName;
    private int NSX;
    private hangSanXuat hangSanXuat;
    private double giaVe;
    private day ngayChieu;

    public bo_Phim(String movieName, int NSX, hangSanXuat hangSanXuat, double giaVe, day ngayChieu) {
        this.movieName = movieName;
        this.NSX = NSX;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNSX() {
        return NSX;
    }

    public void setNSX(int NSX) {
        this.NSX = NSX;
    }

    public hangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(hangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public day getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(day ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    
    // kiểm tra bộ phim có giá vé rẻ hơn
   public boolean kiemTraGiaVeReHon(bo_Phim phimKhac){
       return this.giaVe < phimKhac.giaVe;
   }
   public double giaVeKhuyenMai(double x){
       return this.giaVe * (1-x/100);
   }
   public String layTenHangSanXuat(){
       return this.hangSanXuat.getTenHangSanXuat();
   }
    public String layTenQuocGia(){
       return this.hangSanXuat.getQuocGia();
   }
    public String layTenMovie(){
       return this.getMovieName();
   }
}
