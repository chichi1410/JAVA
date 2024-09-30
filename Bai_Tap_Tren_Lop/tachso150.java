/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop;

/**
 *
 * @author Admin
 */
public class tachso150 {
    public static void main(String[] args) {
        int n =150;
        String tong;
        for(int i=0 ; i<n ; i++){
            System.out.println(i);
            String number = Integer.toString(i);
            char firstChar = number.charAt(0);
           // char midChar = number.charAt(1);
            char lastChar = number.charAt(number.length() - 1);  // Số cuối
           // System.out.println("so dau: "+firstChar + " | so cuoi : " +lastChar );
           if(i >9)
            if(firstChar == lastChar){
                System.out.println("2 so bang nhau: "+firstChar+lastChar);
            }
        }
       
        
    }
  
}
