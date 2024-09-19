/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_44_abstract_PhuongThucTruuTuong;

/**
 *
 * @author Admin
 */
public class hinhChuNhat extends hinh {
    private double chieuDai , chieuCao;

//    public hinhChuNhat(toaDo ToaDO) {
//        super(ToaDO);
//    }

    public hinhChuNhat(double chieuDai, double chieuCao, toaDo ToaDO) {
        super(ToaDO);
        this.chieuDai = chieuDai;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhdientich() {
       return (this.chieuDai + this.chieuCao)*2;
    }
    
}
