/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_46_MayTinhBoTui_Interface;

/**
 *
 * @author Admin
 */
public class main_46_1 {
    public static void main(String[] args) {
        mayTinhCasio casio = new mayTinhCasio();
        mayTinhVinacal vinacal = new mayTinhVinacal();
        
        System.out.println("cong casio : " + casio.cong(3, 4));
        System.out.println("nhan vinacal : " + vinacal.nhan(2, 5));
    }
}
