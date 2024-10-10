/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_77_78_JavaSwing_View;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class view {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("cua so java"); // set tieu de
        jf.setSize(600,400); // chieu ngang 600 doc 400
      //  jf.setLocation(300 ,200); // set vi tri hien thi cua so (từ ở góc sang chính giữa)
        jf.setLocationRelativeTo(null); // set vi tri hien thi cawn giuwa
        
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // lenh de thoat khoi chuowng trinh khi tat cua so
        // neu ko tat chuong trinh van se chay , se chiem ram
        jf.setVisible(true); // lenh nay dung de hien thi cua so jframe ra man hinh
    }
}
