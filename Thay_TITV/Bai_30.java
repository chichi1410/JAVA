/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thay_TITV;

/**
 *
 *
 */
public class Bai_30 {

    private int day;
    private int month;
    private int year;

    public Bai_30(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void printDay() {
        System.out.println("day : " + this.day);
    }

    public void printMonth() {
        System.out.println("month : " + this.month);
    }

    public void printYear() {
        System.out.println("year : " + this.year);
    }

    public void printDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
