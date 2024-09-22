/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_50_SoSanhChuoi;

/**
 *
 * @author Admin
 */
public class soSanh_equals {

    public static void main(String[] args) {
        String s1 = "daihoa";
        String s2 = "DAIHOA";
        String s3 = "daihoa";
        //so sanh = ham equals co phan biet chu in hoa va ko in hoa
        System.out.println("s1 equals s2 : " + s1.equals(s2));
        System.out.println("s1 equals s3 : " + s1.equals(s3));

        // so sanh = ham equalsIgnoreCase ko phan biet in hoa va chu thuong
        System.out.println("s1 equals s2 : " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equals s3 : " + s1.equalsIgnoreCase(s3));
        System.out.println("------------------------------------------------------");

        // ham compareto so sanh do dai cua chuoi co thong qua bang ma 
        // neu chuoi lon hon => so duong
        // neu chuoi nho hon => so am
        //neu chuoi bang nhau => 0
        String sv1 = "Nguyen Dai";
        String sv2 = "Nguyen DaiA";
        String sv3 = "Nguyen D";
        String sv4 = "Nguyen Dai";
        String sv5 = "Nguyen DaiB";

        System.out.println("so sanh sv1 va sv2 : " + sv1.compareTo(sv2)); // sv1 nho hon sinh vien 2  = 1 ki tu space
        System.out.println("so sanh sv1 va sv3 : " + sv1.compareTo(sv3)); // sv1 lon hon sinh vien 3 = 1  ki  tuspace
        System.out.println("so sanh sv1 va sv4 : " + sv1.compareTo(sv4)); // sv1 = sv4
        System.out.println("so sanh sv2 va sv5 : " + sv2.compareTo(sv5)); // b > a trong bang ma
        System.out.println("------------------------------------------------------");
        
        // ham comparatoIgnoreCase tuong tu comparato - ko phan biet chu hoa hay chu thuong
        
        // ham regionMathches =>  so sanh 1 doan tu a den b
        String r1 = "nguyenhoa";
        String r2 = "nguyendaihoa";
        // so sanh bat dau tu ki tu 0 r1 , so sanh vs r2 , bat dau tu 0 r2 den , 5 cua r2
        boolean check0_5 = r1.regionMatches(0, r2, 0, 5);
        System.out.println("so sanh tu 0 den 5 : " + check0_5);
        boolean check0_7 = r1.regionMatches(0, r2, 0, 7);
        System.out.println("so sanh tu 0 den 6 : " + check0_7);
        System.out.println("------------------------------------------------------");
        
        // ham startwith => kiem tra chuoi bat dau bang.....
        String sdt = "0906492454";
        String sdt1 = "0906345454";
        String sdt2 = "049548344";
        System.out.println("check choi 1 co  bat dau bang (0906) hay ko  : " + sdt.startsWith("0906"));
        System.out.println("check choi 1 co  bat dau bang (0906) hay ko  : " + sdt1.startsWith("0906"));
        System.out.println("check choi 1 co  bat dau bang (0906) hay ko  : " + sdt2.startsWith("0906"));
        System.out.println("------------------------------------------------------");
        
        // ham endswith kiem tra chuoi ket thuc bang.......
        
        String tenFile1 = "hoa.png";
        String tenFile2 = "hoa.txt";
        if(tenFile1.endsWith(".png")){
            System.out.println("day la file anh ");
        }
        if(tenFile2.endsWith(".txt")){
            System.out.println("day la file tex");
        }

    }
}
