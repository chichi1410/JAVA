/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_63_Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

// cái nào vào trc ra trc vào sau ra sau 
// sử dụng Deque để thêm first là last 
// có thể xuất first trc last sau và ngược lại
public class DeQue {

    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("nguyen dai hoa");
        danhSachSV.offer("lieu nhu yen");
        danhSachSV.offer("nhi cau tu");
        danhSachSV.offerLast("trum cuoi");
        danhSachSV.offerFirst("trum dau");
        // trum cuoi => nhi cau tu => lieu nhu yen > nguyen dai hoa => trum dau 
//        while (true) {
//            String ten = danhSachSV.poll();
//            if (ten == null) {
//                break;
//            }
//            System.out.println(ten);
//        }
        while(true) {
            String ten1 = danhSachSV.pollLast();
            if(ten1 == null){
                break;
        }
            System.out.println(ten1);
        }
    }
}