/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_65_Map_VD_TuDienAnhViet;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tuDien_Map {
    private Map<String , String> duLieu = new TreeMap<String , String>();
    
    // them tu khoa
    public String themTuKhoa(String tuKhoa, String yNghia){
        return this.duLieu.put(tuKhoa, yNghia);
    }
    // xoa tu khoa
    public String xoa(String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }
    // tra tu khoa tra ra y nghia
    // ko hieu lam
    public String traTu(String tuKhoa){
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }
    // lay ra het tu ca tu khoa = ham keySet
    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    // lay ra so luong
    public int laySoLuong(){
        return this.duLieu.size();
    }
    public void deleteAll(){
        this.duLieu.clear();
    }
    public static void main(String[] args) {
        tuDien_Map TD = new tuDien_Map();
        int luaChon =0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("-------------menu------------");
            System.out.println("1.them tu khoa");
            System.out.println("2.xoa tu khoa");
            System.out.println("3.tra tu khoa");
            System.out.println("4.lay het tat ca tu khoa");
            System.out.println("5.lay so luong");
            System.out.println("6.xoa tat ca");
            System.out.println("0.thoat chuong trinh");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("nhap tu can them");
                    System.out.println("tu khoa: ");
                    String tuKhoa = scanner.nextLine();
                    System.out.println("y nghia: ");
                    String yNghia = scanner.nextLine();
                    TD.themTuKhoa(tuKhoa, yNghia);
                    break;
                case 2:
                    System.out.println("nhap tu khoa can xoa : ");
                    tuKhoa = scanner.nextLine();
                    TD.xoa(tuKhoa);
                    break;   
                case 3:
                     System.out.println("nhap vao tu khoa can tra: ");
                     tuKhoa = scanner.nextLine();
                     TD.traTu(tuKhoa);
                    break;    
                case 4:
                    System.out.println("tat ca tu khoa" );
                    TD.inTuKhoa();
                    break;    
                 case 5:
                    System.out.println("Số lượng từ khóa trong từ điển: " + TD.laySoLuong());
                    break;
                case 6:
                    System.out.println("da xoa all");
                    TD.deleteAll();
                    
                    break;    
                default:
                   
            }
        }while(luaChon != 0 );
        
    }
            
}
