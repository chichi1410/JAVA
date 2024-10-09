/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_61_BAITAP_QuanLyDanhSachSinhVien;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class danhSachSV {

    private ArrayList<sinhVien> danhSach;

    public danhSachSV() {
        this.danhSach = new ArrayList<sinhVien>();
    }

    public danhSachSV(ArrayList<sinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1. them  1 sinh vien
    public void addSV(sinhVien sv) {
        this.danhSach.add(sv);
    }

    // 2. in danh sach sinh vien
    public void inRaDSSV() {
        for (sinhVien Sinhvien : danhSach) {
            System.out.println(Sinhvien); // Tên biến đã nhất quán
        }

    }
     //3. kiem tra danh sach co rong hay khong
    public boolean kiemTraRong(){
        return this.danhSach.isEmpty();
    }
    // 4.lay ra so luong sinh vien trong danh sach
    public int layRaSoLuongSV(){
        return this.danhSach.size();
    }
    
    //5: lam rong sinh vien trong danh sach
    public void lamRongDanhSach(){
        this.danhSach.remove(danhSach);
    }
    
    // 6 kiem tra sinh vien co ton tai hay ko, dua tren ma sinh vien
    public boolean kiemTraSV(sinhVien sv){
        return this.danhSach.contains(sv);
        
        //contains dich = chua 
    }
     // 7. xoa 1 sv ra khoi danh sach dua tren ma sv
     public boolean xoaSV(sinhVien sv){
        return this.danhSach.remove(sv);
        //contains dich = chua 
    }
     // 8 tim kiem sinh vien dua vao ten dc nhap vao tu ban phim
     public void timKiemSV_TenSV(String sv){
         for (sinhVien SVien : danhSach) {
             if(SVien.getFullName().indexOf(sv) >= 0){
                 System.out.println(SVien);
             }
         }
        
     } 
     public void ghiVaoFile(File file){
         try {
             OutputStream os = new FileOutputStream(file);
             ObjectOutputStream oos= new ObjectOutputStream(os);
             for (sinhVien vien : danhSach) {
                 oos.writeObject(vien);
             }
             oos.flush();
             oos.close();
         } catch (Exception e) {
         }
     }

//    void docDuLieuTuFile(File f1) {
//        try {
//            InputStream is = new FileInputStream(f1);
//            ObjectInputStream ois = new ObjectInputStream(is);
//            sinhVien sv =null;
//            while(true){
//                Object oj = ois.readObject(); 
//                if(oj == null){
//                    break;
//                }
//                if(oj != null){
//                    sv = (sinhVien) oj;
//                    this.danhSach.add(sv);
//                }  
//               
//            }
//            ois.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
      void docDuLieuTuFile(File f1) {
    try {
        InputStream is = new FileInputStream(f1);
        ObjectInputStream ois = new ObjectInputStream(is);
        sinhVien sv = null;

        // Sử dụng vòng lặp để đọc nhiều đối tượng cho đến khi gặp EOFException
        while (true) {
            try {
                Object oj = ois.readObject(); // Đọc từng đối tượng từ file
                sv = (sinhVien) oj;
                this.danhSach.add(sv); // Thêm đối tượng vào danh sách
            } catch (EOFException eof) {
                // Đã đọc đến hết file
                break;
            }
        }

        ois.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
 
}
