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
        tac_Gia tacGia1 = new tac_Gia("nguyeen dai hoa ", ngay1);
        tac_Gia tacGia2 = new tac_Gia("tu khuyet ", ngay2);
        tac_Gia tacGia3 = new tac_Gia("hoa vo khuyet ", ngay3);
        tac_Gia tacGia4 = new tac_Gia("lieu nhu yen ", ngay4);
        //
        book book1 = new book("nam quoc son ha", 10000, 2000, tacGia1);
        book book2 = new book("dai phan dien", 900000, 2001, tacGia2);
        book book3 = new book("tran tao tan the chi lu", 100000, 2010, tacGia3);
        book book4 = new book("vo luyen dinh phong", 20000, 2000, tacGia4);

        book1.inTenSach();
        book2.inTenSach();
        book3.inTenSach();
        book4.inTenSach();

        System.out.println("so sanh NXB book 1 va 2 :" + book1.kiemTraCungNamXuatBan(book2));
        System.out.println("so sanh NXBbook 1 cva 3 : " + book1.kiemTraCungNamXuatBan(book3));
        System.out.println("so sanh NXB book 1 va 4 : " + book1.kiemTraCungNamXuatBan(book4));

        System.out.println("giam 20% so tien con lai =" + book1.giamGiaBan(20));

    }

}
