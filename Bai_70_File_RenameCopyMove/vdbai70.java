/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_70_File_RenameCopyMove;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class vdbai70 {
    public  void saoChepFileCon(File f1 , File f2){
        // copy ban than no
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
        if(f1.isDirectory()){
            File[] mangcon = f1.listFiles();
            for (File file : mangcon) {
                File newfile = new File(f2.getAbsoluteFile()+"/"+file.getName());
                saoChepFileCon(file, newfile);
            }
        }
    }
    
    
    public static void main(String[] args) {
        vdbai70 vd70 = new vdbai70();
        File file1 = new File("C:\\Users\\Admin\\Desktop\\rename1.txt");

        File file2 = new File("C:\\Users\\Admin\\Desktop\\dadoiten.txt");
        File file3 = new File("C:\\Users\\Admin\\Desktop\\dadoitenbangtrycatch.txt");
        File file4 = new File("C:\\Users\\Admin\\Desktop\\test");
         File file5 = new File("C:\\Users\\Admin\\Desktop\\test\\dadoiten.txt"); // di chuyen vao thu muc test
        
        file4.mkdir();
        System.out.println("da tao thu muc test");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(vdbai70.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("da tao file "+file1.getName());
       
        // cach 1 doi ten bang . renameTo
        System.out.println("da doi ten "+ file1.renameTo(file2));
        // 
        //cach 2 doi de bang phuong thuc ghi de move
        try {
           Files.move(file1.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
        
        // di chuyen file
        try {
           
            Files.move(file2.toPath(), file5.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException e) {
        }
        System.out.println("da di chuyen file2 vao thu muc test");
        
        // copy file
        File file6 = new File("C:\\Users\\Admin\\Desktop\\coppy.txt");
            
            File file7 = new File("C:\\Users\\Admin\\Desktop\\copy_F1");
        try {
            file6.createNewFile();
            Files.copy(file6.toPath(), file7.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
        System.out.println("copy file thanh cong");
        
        // sao chep toan bo file
        
        vd70.saoChepFileCon(file6, file7);
                
    }
}
