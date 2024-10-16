/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_68_ThaoTacTrenFile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class vdFile {

    File file;

    public vdFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi(){
        // kiem tra file co the thuc thi
        return this.file.canExecute();
    }
    public boolean kiemTraFileRead(){
        //kiem tra file co the doc 
       return this.file.canRead();
    }
    public boolean kiemtraFileWrite(){
        // kiem tra file co the ghi
       return this.file.canWrite();
    }
    public void getLinkFile(){
        // lay ra duong dan
        System.out.println(this.file.getAbsolutePath());
    }
    public void getNameFile(){
        System.out.println(this.file.getName());
    }
    public void kiemTraLaThuMucHayTapTin(){
        if(this.file.isDirectory()){
            System.out.println("day la thu muc");
        }else if(this.file.isFile()){
            System.out.println("day la file");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("nhap ten file : ");
        String tenFile = sc.nextLine();
        vdFile vdf = new vdFile(tenFile);
        do {
            System.out.println("--------------menu-------------");
            System.out.println("1.kiem tra file co the thuc thi");
            System.out.println("2.kiem tra file co the doc");
            System.out.println("3.kiem tra file co the ghi");
            System.out.println("4.in duong dan");
            System.out.println("5.in ten file");
            System.out.println("6.kiem tra file la thu muc hay tap tin");
            System.out.println("7.in ra danh sach cac file con");
            System.out.println("8.in ra cay thu muc");
            System.out.println("0.thoat chuong trinh");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("kiem thuc thi file");
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("kiem tra doc file");
                    System.out.println(vdf.kiemTraFileRead());
                    break;
                case 3:
                    System.out.println("kiem tra ghi file");
                    System.out.println(vdf.kiemtraFileWrite());
                    break;
                case 4:
                    System.out.print("duong dan :");
                    vdf.getLinkFile();
                    break;
                case 5:
                    System.out.print("ten file :");
                    vdf.getNameFile();
                    break;
                case 6:
                    System.out.print("day la :");
                    vdf.kiemTraLaThuMucHayTapTin();
                default:
               
            }
        } while (luaChon != 0);
    }
}
// C:\\Users\\Admin\\Desktop\\