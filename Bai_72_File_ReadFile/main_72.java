/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_72_File_ReadFile;

import java.io.File;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Admin
 */
public class main_72 {
    public static void main(String[] args) {
        // cach 1
        File f1 = new File("C:\\Users\\Admin\\Desktop\\helo.txt");
        try {
            List<String> alltext = Files.readAllLines(f1.toPath() , StandardCharsets.UTF_8);
            // sử dụng list để chứa text , sử dụng readallline de doc , su dung bảng mã utf - 8
            for (String line : alltext) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
