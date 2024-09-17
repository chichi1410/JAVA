/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_39_KeThua;

/**
 *
 * @author Admin
 */
public class hocSinhVip extends conNguoi {
    private String tenLop;
    private String tenTruong;

    public hocSinhVip(String name, int old,String tenLop, String tenTruong) {
        super(name, old);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }
    
    public String getTenLop(){
        return tenLop;
    }
    public void setTenLop(String tenLop){
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    
    public void lamBaiTap(){
        System.out.println("hello word");
    }
    
}
