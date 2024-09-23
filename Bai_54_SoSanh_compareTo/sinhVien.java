/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_54_SoSanh_compareTo;

/**
 *
 * @author Admin
 */
public class sinhVien implements Comparable<sinhVien>{

    private int msv;
    private String name;
    private String classs;
    private double averageScore;

    public sinhVien(int msv, String name, String classs, double averageScore) {
        this.msv = msv;
        this.name = name;
        this.classs = classs;
        this.averageScore = averageScore;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

//    @Override
//    public int compareTo(sinhVien o) {
//        // > 0
//        // < 0
//        // = 0
//        //vd so sanh ma sinh vien
//        
//        return this.msv - o.msv;
//    }
    
    
    public String getTen(){
        String s = this.name.trim();
        if(s.indexOf(" ") >= 0){
           int vitri =  s.lastIndexOf(" ");
           return s.substring(vitri+1);
        }else{
            return s;
        }
    } 
    
     @Override
    public int compareTo(sinhVien o) {
        //vd so sanh ten sinh vien
        // nguyen dai hoa , nguyen si anh , nhan mac qua , jack
        
        String nameCut = this.getTen();
        String teno = o.getTen();
        
        return nameCut.compareTo(teno);
    }
    

}
