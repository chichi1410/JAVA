/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_41_viSaoKhongCoTinhDaKeThua;

/**
 *
 * @author Admin
 */
public class human {
    protected String name;
    protected String sex;
    protected int yearOfBirth;
    
    public human(String name , String sex , int yearOfBirth){
        this.name = name;
        this.sex= sex;
        this.yearOfBirth = yearOfBirth;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
        
}
