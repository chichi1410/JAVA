/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_39_KeThua;

/**
 *
 * @author Admin
 */
public class main_39 {
    public static void main(String[] args) {
        conNguoi cn = new conNguoi("nguyen dai hoa", 20);
        cn.an();
        cn.uong();
        cn.ngu();
        
        hocSinhVip hsv = new hocSinhVip("nguyen dai hoa", 20, "itk29tpm", "dtu");
        hsv.getName();
        hsv.getOld();
        hsv.getTenLop();
        hsv.getTenTruong();
        hsv.lamBaiTap();
    }
}
