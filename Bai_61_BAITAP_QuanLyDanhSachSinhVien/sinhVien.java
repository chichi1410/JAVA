/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_61_BAITAP_QuanLyDanhSachSinhVien;

/**
 *
 * @author Admin
 */
public class sinhVien {
    private String MSV;
    private String fullName;
    private int yearOfBirth;
    private float averageScore;

    public sinhVien(String MSV, String fullName, int yearOfBirth, float averageScore) {
        this.MSV = MSV;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.averageScore = averageScore;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearofbirth() {
        return yearOfBirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "sinhVien[ " + "MSV =" + MSV + "| Name =" + fullName + "| yearOfBirth =" + yearOfBirth + "| Score =" + averageScore + ']';
    }
    
    
}
