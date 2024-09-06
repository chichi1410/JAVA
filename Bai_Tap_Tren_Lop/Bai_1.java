
package Bai_Tap_Tren_Lop;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n = scanner.nextInt();
        int s = 1;
        for(int i=0 ; i<n ; i++){
            s += i;
          System.out.println(s);
        }     
    }
            
}
