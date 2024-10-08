/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_71_File_WrirtingFile;

import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class main_71 {
    public static void main(String[] args) {
        try {
            PrintWriter PW = new PrintWriter("C:\\Users\\Admin\\Desktop\\helo.txt" , "UTF-8");
            PW.println("hello word");
            PW.print(3.14);
            PW.println("day la so PI");
            studen st = new studen(1 ,"nguyen dai hoa");
            PW.print(st);
            PW.flush(); // day data xuong file
            PW.close(); // dong file lai
        } catch (Exception e) {
            e.printStackTrace(); // in ra loi neu co loi
        }
        
    }
}
