/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_61_BAITAP_QuanLyDanhSachSinhVien;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Admin
 */
public class sinhVien implements Comparable<sinhVien> , Serializable { // muon docj file phai co dong nay
    private String MSV;
    private String fullName;
    private int yearOfBirth;
    private float averageScore;

    public sinhVien(String MSV) {
        this.MSV = MSV;
    }

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

    @Override
    public int compareTo(sinhVien o) {
        return this.MSV.compareTo(o.MSV);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.MSV);
        return hash;
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
        final sinhVien other = (sinhVien) obj;
        return Objects.equals(this.MSV, other.MSV);
    }
    
    
}
