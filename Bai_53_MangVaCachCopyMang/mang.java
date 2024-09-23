/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_53_MangVaCachCopyMang;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class mang {
    public static void main(String[] args) {
        // kieu nguyen thuy
        int mang1[] = {1,2,3,4};
        //copy mang
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println("mang1 :  " + Arrays.toString(mang1 ));
        System.out.println("mang1_a : " + Arrays.toString(mang1_a));
        System.out.println("kết luận sau khi sử dụng toán tử  = thì mảng ban đầu \n"
                + "tại [0] = 1 cũng bị thay thế thành [0] = 100");
        System.out.println("-------------------------------------------");
        
        // su dung ham clone()
        System.out.println("su dung ham clone de khac phuc");
        int[] mang2 = {1,2,3,4};
        int[] mang2_a = mang2.clone();
        mang2_a[0] = 50;
        System.out.println("mang2 : " + Arrays.toString(mang2));
        System.out.println("mang2_a : " + Arrays.toString(mang2_a));
         System.out.println("-------------------------------------------");
         
         // hoac su dung ham System.arrcopy
    }
}
