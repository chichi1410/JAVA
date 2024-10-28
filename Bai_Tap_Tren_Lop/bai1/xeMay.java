/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop.bai1;

/**
 *
 * @author Admin
 */
public class xeMay {
 
    private String bienSoXe;
    public String tenXe;
    private int dungTichXang;
    public double giaBan;
    private float napthue; // Thuế

    public xeMay(String bienSoXe, String tenXe, int dungTichXang, double giaBan, float napthue) {
        this.bienSoXe = bienSoXe;
        this.tenXe = tenXe;
        this.dungTichXang = dungTichXang;
        this.giaBan = giaBan;
        this.napthue = napthue;
    }


    public double muaXe() {
        return giaBan + napthue;
    }


    public double thueXe(int soNgayThue) {
        return muaXe() * 0.001 * soNgayThue;
    }


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
}


