/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_58_CacLopTime_Date_Datefomat_Calendar;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
// java.until.date laf cha java.sql.date , time , timestamp
public class class_time {
    public static void main(String[] args) {
        Locale lc = new Locale("vn", "VN");
        NumberFormat numf = NumberFormat.getInstance(lc);
        // ham lay thoi gian hien tai
        // thoi gian de chay 1 vong lap for 1tr lan
        // lay moc t2 - t1;
        long t1 = System.currentTimeMillis();
        for(int i=0 ; i<1 ; i++){
            System.out.println("test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t1 = " + numf.format(t1));
        System.out.println("t2 = " + numf.format(t2));
        System.out.println("thoi gian chay 1 vong lap for : " + ((t2 - t1))+ "mls");
        System.out.println("thoi gian chay 1 vong lap for : " + ((t2 - t1)/1000)+ "s");
        
        // timeUnit
        // ham chuyen doi thoi gian
        // import java.util.concurrent.timeUnit;
        System.out.println("30 nam = " + numf.format(TimeUnit.DAYS.toSeconds(30*365)) + "s");
        System.out.println("24h = " + numf.format(TimeUnit.HOURS.toSeconds(24)) + "s");
        System.out.println("1p = " + TimeUnit.MINUTES.toSeconds(1));
        System.out.println("----------------------------------------------------");
        
        // ham date
        // lay ra day mom year ngay hom nay
        Date d = new Date(System.currentTimeMillis());
        System.out.println("day / month / year: " + d.getDate()+ "/" + (d.getMonth()+1) +"/" + (d.getYear()+1900));
        System.out.println("time : " + d.getHours() +"h"+d.getMinutes()+"p"+d.getSeconds()+"s");
        //tuong tu ham date , su dung ham calendar
        Calendar cld = Calendar.getInstance();
        System.out.println("day: "+cld.get(Calendar.DATE) + "/"+(cld.get(Calendar.MONTH)+1)+"/"+cld.get(Calendar.YEAR));
        //tang giam thoi gian
        cld.add(Calendar.HOUR ,24);
        System.out.println("sau khi cong 24h: "+cld.get(Calendar.DATE) + "/"+(cld.get(Calendar.MONTH)+1)+"/"+cld.get(Calendar.YEAR));
        System.out.println("----------------------------------------------");
        
        //dateFomat
        DateFormat df = new SimpleDateFormat();
        System.out.println("thoi gian sau khi da format :" + df.format(d));
        // thay doi tg america sang viet nam
        df = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss");
        //luu y MM phai viet hoa
        System.out.println(df.format(d));
        
        
        
    }
    
}
