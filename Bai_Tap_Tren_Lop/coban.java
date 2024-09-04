/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_TITV;

import java.awt.BorderLayout;
import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class coban {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ten ban la: ");
        String HoTen = scanner.nextLine();
        System.out.print(" nhap tuoi cua ban: ");
//        int Tuoi = Integer.parseInt(scanner.nextLine());
        int Tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("que quan cua ban la: ");
        String QueQuan = scanner.nextLine();

        System.out.println("ten ban la : " + HoTen);
        System.out.println("tuoi cua ban la : " + Tuoi);
        System.out.println(" que: " + QueQuan);

    }
}
