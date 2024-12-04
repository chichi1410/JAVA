/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_81_JavaSwing_MoHinh_MCV.Test;

import Bai_81_JavaSwing_MoHinh_MCV.Model.CounterModel;
import Bai_81_JavaSwing_MoHinh_MCV.View.CounterView;

/**
 *
 * @author Admin
 */
public class test {

    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());

        CounterView ctw = new CounterView();
    }
}
