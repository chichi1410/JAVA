/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_63_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;



// cái nào vào trc cái đó ra trc cái nào vào sau thì ra sau
//sử sụng offer là dạng trả về true hoặc false
//khi lay hết tên trong danh sách sử dụg if để out vòng lặp
public class queue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        
        danhSachSV.offer("nguyen dai hoa");
        danhSachSV.offer("lieu nhu yen");
        danhSachSV.offer("tieu mi");
        danhSachSV.offer("nhi cau tu");
        
        while(true){
            String ten = danhSachSV.poll(); // lay ra ten sinh vien va xoa
           // String ten = danhSachSV.peek(); // lay ra ten sinh vien nhuwng k xoa
           
             if(ten == null){
                break;
            }
             System.out.println(ten);
        }
        
    }
}
