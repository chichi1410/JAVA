/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_73_74_File_LuuDoiTuongXuongFile;

import Bai_61_BAITAP_QuanLyDanhSachSinhVien.sinhVien;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Admin
 */
public class Main_73 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\Users\\Admin\\Desktop\\helo.txt");
            OutputStream os = new FileOutputStream(f1); // tao output de ghi file
            ObjectOutputStream oos = new ObjectOutputStream(os); // tao output de ghi file
            sinhVien sv = new sinhVien("111", "nguyen dai hoa", 2004, 9);
            
            oos.writeObject(sv);
            oos.flush();
            oos.close();
            
        } catch (Exception e) {
            
            // qua bai quan ly sinh vien de xem cach ghi file doi tuong sinh vien
            
        }
    }
}
