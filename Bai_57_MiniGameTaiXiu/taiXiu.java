package Bai_57_MiniGameTaiXiu;

import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class taiXiu {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double soDuTaiKhoan = 100000;
        Locale lc = new Locale("vn", "VN");
        NumberFormat numf = NumberFormat.getInstance(lc);

        int luaChon;
        do {
            System.out.println("|----------------------------------------|");
            System.out.println("|                menu                    |");
            System.out.println("|----------------------------------------|");
            System.out.println("|1. Bấm phím 1 để bắt đầu chơi           |");
            System.out.println("|2. Nhấn phím bất kỳ để thoát            |");
            System.out.println("|----------------------------------------|");
            luaChon = scanner.nextInt();
            
            if (luaChon == 1) {
                double datCuoc;
                System.out.println("----------play game--------- ");
                System.out.println("Số dư tài khoản: " + numf.format(soDuTaiKhoan) + ". Bạn muốn cược bao nhiêu?");
                
                // Nhập số tiền cược
                do {
                    System.out.println("Số tiền đặt cược <= " + numf.format(soDuTaiKhoan));
                    datCuoc = scanner.nextDouble();

                } while (datCuoc > soDuTaiKhoan || datCuoc <= 0);

                // Chọn tài/xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("1 : Chọn Tài\n2 : Chọn Xỉu");
                    luaChonTaiXiu = scanner.nextInt();

                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung xúc xắc
                Random random = new Random();
                int giaTri1 = random.nextInt(6) + 1;
                int giaTri2 = random.nextInt(6) + 1;
                int giaTri3 = random.nextInt(6) + 1;
                int tongXucXac = giaTri1 + giaTri2 + giaTri3;

                System.out.println("xx1: " + giaTri1 + " | xx2: " + giaTri2 + " | xx3: " + giaTri3);
                System.out.println("Tổng xúc xắc là: " + tongXucXac);

                // Xử lý kết quả
                if (tongXucXac == 3 || tongXucXac == 18) {
                    System.out.println("|-----------------------------------------|");
                    System.out.println("|Nhà cái ăn hết! Chúc bạn may mắn lần sau!|");
                    System.out.println("|-----------------------------------------|");
                    soDuTaiKhoan -= datCuoc;
                } else if (tongXucXac >= 4 && tongXucXac <= 10) {
                    if (luaChonTaiXiu == 2) {
                        System.out.println("ban da chon xiu");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Chúc mừng! Bạn đã thắng cược.|");
                        System.out.println("|-----------------------------|");
                        soDuTaiKhoan += datCuoc;
                    } else {
                        System.out.println("ban da chon tai");
                        System.out.println("|--------------------------------------|");
                        System.out.println("|Bạn đã thua. Chúc bạn may mắn lần sau.|");
                        System.out.println("|--------------------------------------|");
                        soDuTaiKhoan -= datCuoc;
                    }
                } else if (tongXucXac >= 11 && tongXucXac <= 17) {
                    if (luaChonTaiXiu == 1) {
                        System.out.println("ban da chon tai");
                        System.out.println("|-----------------------------|");
                        System.out.println("|Chúc mừng! Bạn đã thắng cược.|");
                        System.out.println("|-----------------------------|");
                        soDuTaiKhoan += datCuoc;
                    } else {
                        System.out.println("ban da chon xiu");
                       System.out.println("|--------------------------------------|");
                        System.out.println("|Bạn đã thua. Chúc bạn may mắn lần sau.|");
                        System.out.println("|--------------------------------------|");
                        soDuTaiKhoan -= datCuoc;
                    }
                }

                System.out.println("Số dư hiện tại: " + numf.format(soDuTaiKhoan));

                // Kiểm tra số dư
                if (soDuTaiKhoan <= 0) {
                    System.out.println("Bạn đã hết tiền. Trò chơi kết thúc.");
                    break;
                }
            }

        } while (luaChon == 1);

        // Hiển thị thông điệp kết thúc
        String message = "Có làm thì mới có ăn. Khó làm đi đánh tài xỉu!";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(300);
        }
        scanner.close();
    }
}
