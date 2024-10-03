/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_64_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;


/**
 *
 * @author Admin
 */
public class rutThamTrungThuong_HashSet {
    
    Set<String> thungPhieu = new HashSet<String>();

    public rutThamTrungThuong_HashSet() {
    }
    public boolean themPhieu(String giaTri){
        return this.thungPhieu.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.thungPhieu.remove(giaTri);
    }
    public boolean kiemTraTonTai(String giaTri){
        return this.thungPhieu.contains(giaTri);
    }
    public void deleteAll(){
        this.thungPhieu.clear();
    }
    public int laySoLuongPhieu(){
        return this.thungPhieu.size();
    }
    public void inRa(){
        System.out.println(Arrays.toString(this.thungPhieu.toArray()));
    }
    public String randomX1Phieu(){
         String ketQua = "";
         Random rd = new Random();
         int viTri = rd.nextInt(this.thungPhieu.size()-1);
         ketQua = (String) this.thungPhieu.toArray()[viTri];
         return ketQua;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rutThamTrungThuong_HashSet rt = new rutThamTrungThuong_HashSet();
        int luaChon = 0;
        do{
            System.out.println("------------------------------");
            System.out.println("-------------menu-------------");
            System.out.println("1.them ma so du thuong");
            System.out.println("2.xoa ma so du thuong");
            System.out.println("3.kiem tra ma so du thuong co ton tai hay k");
            System.out.println("4.xoa tat ca cac phieu du thuong");
            System.out.println("5.so luong phieu du thuong");
            System.out.println("6.rut tham trung thuong");
            System.out.println("7.in ra tat ca");
            System.out.println("0.thoat chuong trinh");
            luaChon = sc.nextInt();
            String giaTri = sc.nextLine();
            switch (luaChon) {
                case 1:
                     System.out.println("them phieu ");
                     giaTri = sc.nextLine();
                     rt.themPhieu(giaTri);
                    break;
                case 2:                   
                    System.out.println("xoa phieu");
                    giaTri = sc.nextLine();
                    rt.xoaPhieu(giaTri);
                    
                    break;
                case 3:
                    System.out.println("kiem tra co ton tai ko");
                    giaTri = sc.nextLine();
                    rt.kiemTraTonTai(giaTri);
                    break;    
                case 4:
                    System.out.println("so luong phieu");
                    rt.laySoLuongPhieu();
                    break;
                case 5:
                    System.out.println("so luong phieu");
                    rt.laySoLuongPhieu();
                    break; 
                case 6:
                    System.out.println("bat dau rut tham");
                    rt.randomX1Phieu();
                    break; 
                case 7:
                    rt.inRa();
                    break;
                default:
                 
            }
            
        }while(luaChon != 0);
        
    }
}
