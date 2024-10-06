/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_69_deleteFileAndDirectory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class deleteFileAndDirectory {
   public static void VDXoaFile(File x) {
    // Nếu là file, xóa ngay lập tức
    if (x.isFile()) {
        x.delete();  // Xóa ngay lập tức thay vì khi chương trình kết thúc
        System.out.println("Đã xóa: " + x.getAbsolutePath());
    } else if (x.isDirectory()) {  // Nếu là thư mục
        File[] mangCon = x.listFiles();  // Lấy tất cả các file con
        if (mangCon != null) {
            for (File f : mangCon) {  // Duyệt từng phần tử trong mảng con
                VDXoaFile(f);  // Gọi lại hàm để xóa file con
            }
        }
        System.out.println("Đã xóa: " + x.getAbsolutePath());
        x.delete();  // Xóa thư mục sau khi đã xóa hết các file con
    }
}
    
    
    
    
    public static void main(String[] args) {
        // tao file
        File file1 = new File("C:\\Users\\Admin\\Desktop\\vidu");
        file1.mkdir();
        File file2 = new File("C:\\Users\\Admin\\Desktop\\vidu1\\vidu2");
        file2.mkdirs();
        File file3 = new File("C:\\Users\\Admin\\Desktop\\helo.txt");
        try {
            file3.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(deleteFileAndDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // xoa file
        file1.deleteOnExit(); // xoa file roongx
        file3.deleteOnExit(); // xoa dc vi day la file txt thong thuong
    //    file2.deleteOnExit(); // ko xoa dc vi day khong phai la thu muc rong
        
        // để xoá dc thư mục có file con thì phải xoá hết file con ở trong
        //rồi xoá từ trong ra ngoài tạo 1 hàm xoá file
        VDXoaFile(file2);
       
        
        // du dung files de xoa cung giong nhu file
        
        
    }
}
