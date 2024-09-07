/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien_Bai_35;

/**
 *
 * @author Admin
 */
public class main_Thu_Vien {

    public static void main(String[] args) {
        ngay ngay1 = new ngay(14, 10, 2004);
        ngay ngay2 = new ngay(15, 10, 2005);
        ngay ngay3 = new ngay(16, 10, 2006);
        ngay ngay4 = new ngay(17, 10, 2007);
//
        tac_Gia tacGia1 = new tac_Gia("nguyeen dai hoa " , ngay1);
        tac_Gia tacGia2 = new tac_Gia("tu khuyet " , ngay2);
        tac_Gia tacGia3 = new tac_Gia("hoa vo khuyet " , ngay3);
        tac_Gia tacGia4 = new tac_Gia("lieu nhu yen " , ngay4);
        //
        book book1 = new book("nam quoc son ha" , 100 , 2000 ,tacGia1);
        book book2 = new book("dai phan dien" , 999 , 2001 ,tacGia2);
        book book3 = new book("tran tao tan the chi lu" , 10 , 2010 ,tacGia3);
        book book4 = new book("vo luyen dinh phong" , 200 , 2006 ,tacGia4);
        
        book1.inTenSach();
         book2.inTenSach();
          book3.inTenSach();
           book4.inTenSach();
           
    }

}
