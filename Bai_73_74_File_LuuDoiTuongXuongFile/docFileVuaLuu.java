/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_73_74_File_LuuDoiTuongXuongFile;

import Bai_61_BAITAP_QuanLyDanhSachSinhVien.sinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;



/**
 *
 * @author Admin
 */
// doc doi tuong tu tap tin len
public class docFileVuaLuu {
    public static void main(String[] args) {
        try {
             File f1 = new File("C:\\Users\\Admin\\Desktop\\helo.txt");
            InputStream is = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(is);
            sinhVien sv = (sinhVien) ois.readObject();
            System.out.println(sv);
            System.out.println(sv.getFullName());
            ois.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
