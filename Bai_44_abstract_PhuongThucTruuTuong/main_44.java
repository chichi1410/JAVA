/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_44_abstract_PhuongThucTruuTuong;

/**
 *
 * @author Admin
 */
public class main_44 {
    public static void main(String[] args) {
        toaDo td1 = new toaDo(1,1);
        toaDo td2 = new toaDo(2,3);
        toaDo td3 = new toaDo(3,5);
        
         //hinh h1 = new hinh(td1); // loi vi hinh dang co lop truu tuong abstract la lop k co that
        
        hinh h1 = new diem(td1);
        hinh h2 = new hinhTron(td2, 5);
        hinh h3 = new hinhChuNhat(14, 16, td3);
        
        System.out.println("dien tich diem : " + h1.tinhdientich());
        System.out.println("dien tich hinh chu nhat : "+ h3.tinhdientich());
        System.out.println("dien tich hinh tron : " + h2.tinhdientich() );
    }
   
    
   
}
