/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_37_QuanLySinhVien;

/**
 *
 * @author Admin
 */
public class ngay {
    private int day ,month , year;
    
    public ngay (int day , int  month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ngay other = (ngay) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        return this.year == other.year;
    }
    
}
