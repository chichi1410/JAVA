/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien_Bai_35;

/**
 *
 * @author Admin
 */
public class ngay {
    
    private int day;
    private int month;
    private int year;
    
    public ngay(int day , int month , int year){
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
    public void setMonth(int month ){
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
        
}
