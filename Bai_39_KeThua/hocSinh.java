/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_39_KeThua;

/**
 *
 * @author Admin
 */
public class hocSinh {
    private String name;
    private int old;
    private String tenLop;
    private String tenTruong;

    public hocSinh(String name, int old, String tenLop, String tenTruong) {
        this.name = name;
        this.old = old;
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    
     public void an (){
         System.out.println("an com");
     }
     public void uong(){
         System.out.println("uong nuoc");
     }
     public void ngu(){
         System.out.println("sleep");
     }
     public void lamBaiTap(){
         System.out.println("hoc ngu");
     }
}
