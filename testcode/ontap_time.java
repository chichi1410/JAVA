/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class ontap_time {
    public static void main(String[] args) {
        Locale lc = new Locale("vn", "VN");
        NumberFormat nf = NumberFormat.getInstance(lc);
        long t1 = System.currentTimeMillis();
        for(int i=0 ; i<10 ; i++){
            System.out.println("test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t1 = "+nf.format(t1));
        System.out.println("t2 = "+nf.format(t2));
        System.out.println("thoi gian chay 1 vong lap : "+(t2-t1)+"mls");
        System.out.println("thoi gian chay 1 vong lap : "+(t2-t1)/1000 +"s");
        
        System.out.println("30 nam = " + TimeUnit.DAYS.toSeconds(365*30)+"s");
        
        Date d = new Date(System.currentTimeMillis());
        System.out.println("hom nay la : "+ d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        System.out.println("luc : "+d.getHours() +"h" +d.getMinutes()+"p"+d.getSeconds()+"S");
        
        DateFormat df = new SimpleDateFormat();
        System.out.println("hom nay luc : "+df.format(d));
    }
}
