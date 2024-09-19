/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_44_abstract_PhuongThucTruuTuong;

/**
 *
 * @author Admin
 */
public  abstract class hinh {
    protected toaDo ToaDo ;
    
    public hinh(toaDo ToaDO){
        this.ToaDo = ToaDo;
    }

    public toaDo getToaDo() {
        return ToaDo;
    }

    public void setToaDo(toaDo ToaDo) {
        this.ToaDo = ToaDo;
    }
     // trong lop truu tuong dinh nghia them 1 phuong thuc truu tuong
    
    public abstract double tinhdientich();
}

