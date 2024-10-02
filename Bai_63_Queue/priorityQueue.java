/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_63_Queue;

import java.util.Queue;
import java.util.PriorityQueue;
// sắp xếp tên theo thứ tự trong bảng chữ cái chứ ko theo cái nào vào trc
// là ra trước vào sau là ra sau

public class priorityQueue {

    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();

        danhSachSV.offer("nguyen dai A");
        danhSachSV.offer("nguyen dai B");
        danhSachSV.offer("van 1");
        danhSachSV.offer("van 2");

        while (true) {
            String ten = danhSachSV.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }

    }
}
