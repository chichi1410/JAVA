/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien_Bai_35;

/**
 *
 * @author Admin
 */
public class book {
    private String tenSach;
    private double giaBan;
    private int namSanXuat;
    private tac_Gia tacGia;
            
    public book (String tenSach , double giaBan , int namSanXuat , tac_Gia tacGia){
        this.tenSach = tenSach;
        this.namSanXuat = namSanXuat;
        this.namSanXuat = namSanXuat;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public tac_Gia getTacGia() {
        return tacGia;
    }

    public void setTacGia(tac_Gia tacGia) {
        this.tacGia = tacGia;
    }
     public void inTenSach(){
         System.out.println(this.tenSach);
     }
      public boolean kiemTraCungNamXuatBan(book sachKhac){
          return this.namSanXuat == sachKhac.namSanXuat;        
      }
      public double giamGiaBan(double x){
          return this.giaBan * (1-x/100);
      }
}
