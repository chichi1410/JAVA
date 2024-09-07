/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien_Bai_35;

/**
 *
 * @author Admin
 */
public class tac_Gia {
     private String tenTacGia;
     private ngay ngaySinh;
     
     public tac_Gia(String tenTacGia , ngay ngaySinh){
         this.tenTacGia = tenTacGia;
         this.ngaySinh = ngaySinh;
     }
     
     public String getTenTacGia(){
         return tenTacGia;
     }
     public void setTenTacGia(String tenTacGia){
         this.tenTacGia = tenTacGia;
     }
     public ngay getNgaySinh(){
         return ngaySinh;
     }
     public void setNgaySinh( ngay ngaySinh){
         this.ngaySinh = ngaySinh;
     }
}
