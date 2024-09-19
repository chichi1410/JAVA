/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_44_abstract_PhuongThucTruuTuong;

/**
 *
 * @author Admin
 */
public class hinhTron  extends hinh{
    
    private double r;
    
    public hinhTron(toaDo ToaDO , double r) {
        super(ToaDO);
        this.r =r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhdientich() {
        return Math.PI *this.r *this.r;
    }

  
    
    
}
