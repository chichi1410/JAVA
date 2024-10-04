/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_67_taoFile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class taoFile {
    public static void main(String[] args){
        // luu y
        //MS windows C:\\admin\\desktop\\file
        //linux , macOS /thumuc/file
        
        // kiem tra thu muc co ton tai hay ko
        File file1 = new File("C:\\Users\\Admin\\Desktop\\java\\JavaApplication3\\src");
        System.out.println("kiem tra file Bai_67_taoFile co ton tai k : "+file1.exists());
        
        // tao 1 thu muc
        //phuong thuc mkdir() => tao 1 thu muc
        File file2 = new File("C:\\Users\\Admin\\Desktop\\filemoine");
        file2.mkdir();
        
        // tao nhieu thu muc
        // phuong thuc mkdirs() => tao ra nhieu thu muc
        File file3 = new File("C:\\Users\\Admin\\Desktop\\file1\\file2\\file3");
        file3.mkdirs();
        
        // tao tap tin co phan mo rong vd .exe .java....
        // phuong  thuc createnewfile()
        File file4 = new File("C:\\Users\\Admin\\Desktop\\helloword.txt");
        try {
            file4.createNewFile();
        } catch (IOException ex) {
            // ko co quyen tao tap tin
            //o cung bi day
            // duong dan bi sai
            // bam vao ! de goi try catch
            Logger.getLogger(taoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
