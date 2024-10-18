/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_81_JavaSwing_MoHinh_MCV.Model;

/**
 *
 * @author Admin
 */
public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void increment(){ // su gia tang
        this.value++;
    }
    public void decrement(){ // su giam sut
        this.value--;
    }
    public void reset(){
        this.value = 0;
    }
}
