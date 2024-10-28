/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop.bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xeOto {

    private String bienSoXe;
    public String tenXeOto;
    private int dungTichXang;
    public double giaBan;
    private float napthue; // Thuế
    private Boolean taiXe; // Có tài xế hay không

  
    public xeOto(String bienSoXe, String tenXe, int dungTichXang, double giaBan, float napthue, Boolean taiXe) {
        this.bienSoXe = bienSoXe;
        this.tenXeOto = tenXe;
        this.dungTichXang = dungTichXang;
        this.giaBan = giaBan;
        this.napthue = napthue;
        this.taiXe = taiXe;
    }

     public void chonTaiXe(int soNgayThue) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có muốn chọn tài xế không? (Y/N): ");
        String n = scanner.nextLine();

        if (n.equals("Y")) {
            taiXe = true;
            System.out.println("Đã chọn có tài xế.");
        } else if (n.equals("N")) {
            taiXe = false;
            System.out.println("Đã chọn không có tài xế.");
        } else {
            System.out.println("Lựa chọn không hợp lệ. Mặc định là không có tài xế.");
            taiXe = false;
        }
        double giaThue = muaXeOto() * 0.0015 * soNgayThue;
        if (taiXe == true) {
            giaThue += 500;
        }else if(taiXe == false){
       
       }
         System.out.println(giaThue);
        
    }
    public double muaXeOto() {
        return giaBan + napthue;
    }

//    public double thueXeOto(int soNgayThue) {
//        double giaThue = muaXeOto() * 0.0015 * soNgayThue;
//        if (taiXe) {
//            giaThue += 500;
//        }
//        return giaThue;
//    }
    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getDungTichXang() {
        return dungTichXang;
    }

    public void setDungTichXang(int dungTichXang) {
        this.dungTichXang = dungTichXang;
    }

    public float getNapthue() {
        return napthue;
    }

    public void setNapthue(float napthue) {
        this.napthue = napthue;
    }

    public Boolean getTaiXe() {
        return taiXe;
    }

    public void setTaiXe(Boolean taiXe) {
        this.taiXe = taiXe;
    }
}

