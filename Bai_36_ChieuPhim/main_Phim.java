/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_36_ChieuPhim;

/**
 *
 * @author Admin
 */
public class main_Phim {
    public static void main(String[] args) {
        day day1 = new day(14,10,2024);
        day day2 = new day(1,2,2025);
        day day3 = new day(21,12,2025);
        
        hangSanXuat hangSanXuat1 = new hangSanXuat("fcnguyen" , "vietnam");
        hangSanXuat hangSanXuat2 = new hangSanXuat("fcmancity" , "england");
        hangSanXuat hangSanXuat3 = new hangSanXuat("fctottenham" , "england");
        
       //
       bo_Phim  bo_Phim1 = new bo_Phim("tay du ky", 2024, hangSanXuat1, 30000, day1);
       bo_Phim  bo_Phim2 = new bo_Phim("huy diet MU", 2025, hangSanXuat2, 20000, day2);
       bo_Phim  bo_Phim3 = new bo_Phim("CLB ko co cup", 2025, hangSanXuat3, 10000, day3);
        // so sánh giá vé phim 1 và 2
         System.out.println("so sanh phim 1 va 2 " + bo_Phim1.kiemTraGiaVeReHon(bo_Phim2));
          System.out.println("so sanh phim 1 va 3 " + bo_Phim1.kiemTraGiaVeReHon(bo_Phim3));
           System.out.println("so sanh phim 3 va 1 " + bo_Phim3.kiemTraGiaVeReHon(bo_Phim1));
     // giamgia
     System.out.println("bo phim 1 giam 10% " + bo_Phim1.giaVeKhuyenMai(10)+"vnd" +
             " | "+ " ten HSX :"+ bo_Phim1.layTenHangSanXuat()+ "| quoc gia : " + bo_Phim1.layTenQuocGia()
     + "| ten tac pham : "+bo_Phim1.getMovieName());
     System.out.println("bo phim 2 giam 50% " + bo_Phim2.giaVeKhuyenMai(50));
     System.out.println("bo phim 3 giam 20% " + bo_Phim3.giaVeKhuyenMai(20));
    }
}
