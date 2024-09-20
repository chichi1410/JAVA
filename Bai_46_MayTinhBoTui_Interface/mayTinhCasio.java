/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_46_MayTinhBoTui_Interface;

/**
 *
 * @author Admin
 */
public class mayTinhCasio implements mayTinhBoTuiInterface{

    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a -b;
    }

    @Override
    public double nhan(double a, double b) {
        
        return a*b;
      }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }
    
}
