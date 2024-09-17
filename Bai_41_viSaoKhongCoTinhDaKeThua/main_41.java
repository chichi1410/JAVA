/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_41_viSaoKhongCoTinhDaKeThua;

/**
 *
 * @author Admin
 */
public class main_41 {
    public static void main(String[] args) {
        vietnamesePeople vn = new vietnamesePeople("nguyen dai hoa", "nam", 2004);
        
        polandPeople pl = new polandPeople("alex", "nam", 2005);
        
        vn.helloVietNam();
        pl.helloPoland();
    }
}
