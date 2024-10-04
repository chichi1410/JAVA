/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testarray {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test= new ArrayList<String>();
        ArrayList<Double> test1 = new ArrayList<Double>();
        for(int i=0 ; i<10 ; i++ ){
           double value = sc.nextDouble();
           test1.add(value);
           
        }
        System.out.println(test1);
                
        test.add("nguyen dai hoa");
        test.add("lieu nhu yen");
        System.out.println(test);
       
    }
}
