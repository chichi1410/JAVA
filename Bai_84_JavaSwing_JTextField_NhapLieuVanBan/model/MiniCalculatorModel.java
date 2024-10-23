/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_84_JavaSwing_JTextField_NhapLieuVanBan.model;

/**
 *
 * @author Admin
 */
public class MiniCalculatorModel {

    private double FirstValue;
    private double SecondValue;
    private double answer; // ket qua

    public MiniCalculatorModel() {

    }

    public double getFirstValue() {
        return FirstValue;
    }

    public void setFirstValue(double FirstValue) {
        this.FirstValue = FirstValue;
    }

    public double getSecondValue() {
        return SecondValue;
    }

    public void setSecondValue(double SecondValue) {
        this.SecondValue = SecondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus() { // cong them
        this.answer = this.FirstValue + this.SecondValue;
    }
    public void minus() { // tru di 
        this.answer = this.FirstValue - this.SecondValue;
    }
    public void multiply() { // nhan them 
        this.answer = this.FirstValue * this.SecondValue;
    }
    public void divide () { // chia
        this.answer = this.FirstValue / this.SecondValue;
    }
    public void pow() {// mu
        this.answer = Math.pow(this.FirstValue, this.SecondValue);
    }
    public void mod(){ // chia lay du
        this.answer = this.FirstValue % this.SecondValue;
    }
}
