
import java.util.Scanner;

public class ToiYeuEm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "nguyendaihoa";
        String loginName;
        int passWord = 14102004;
        int loginPassWord;
        

        do {

            System.out.print("ten dang nhap:");
            loginName = scanner.nextLine().trim();
            System.out.print("\n");
            System.out.print("password: ");
            loginPassWord = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("pass = " + loginPassWord);

            if (userName.equals(loginName) && passWord == loginPassWord) {
                System.out.println("------------------------------------------------------------");
                System.out.println("em giong nhu cam giac thoai mai khi cuon minh trong chan am\r\n"
                        + //
                        "nhung dong thoi cung nhu con gio khong the nam lai\r\n"
                        + //
                        "tua nhu huong nuoc hoa phang phat noi co tay\r\n"
                        + //
                        "nhu yeu khong the buon tay vay\r\n"
                        + //
                        "\r\n"
                        + //
                        "toi yeu em vo cung nhung lai day mau thuan\r\n"
                        + //
                        "dien cuong nhung lai so khong con duong lui\r\n"
                        + //
                        "em co the khien anh dung lai cam giac nay khong\r\n"
                        + //
                        "hay la nhu cuoc gap lan dau ay.\r\n"
                        + //
                        "------------------------------------------------------------");
/*Em giống như cảm giác thoả mái khi cuộn trong chăn ấm
Nhưng đồng thời cũng như cơn gió không thể nắm lại
như hương nước hoa phảng phất nơi cổ tay
Như yêu không thể buôn tay vậy.

Tôi yêu em vô cùng nhưng lại đầy mâu thuẫn
Điên cuồng nhưng lại sợ không còn đường lui
Em có thể khiến anh dừng lại cảm giác này không
Hay là đôi giày duy nhất cuối cùng ấy.*/
                // Define the number of rows
                int rows = 6;
                // Loop to print upper part of the heart
                for (int i = rows / 2; i <= rows; i += 2) {
                    // Print spaces before the upper part of the heart
                    for (int j = 1; j < rows - i; j += 2) {
                        System.out.print(" ");
                    }
                    // Print the left part of the heart
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Print spaces between the two parts of the heart
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    // Print the right part of the heart
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Loop to print the bottom part of the heart
                for (int i = rows; i >= 1; i--) {
                    for (int j = i; j < rows; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (i * 2) - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                System.out.println(
                        "di khap dat troi menh mong\n"
                        + "duong cang xa hanh phuc cang nhieu\n"
                        + "song cang dai hanh phuc cang dam sau\n"
                        + "co ban doi benh canh day chinh la thien duong.");
                /* đi khắp đất trời mênh mông
 * đường càng xa hạnh phúc càng nhiều
 * sông càng dài hạnh phúc càng đậm sâu
 * có bạn đời bênh cạnh đấy chính là thiên đường
                 */

                System.out.println("-----------------code by Nguyen Dai Hoa (Son)----------------");
            } else {
                System.out.println("LOGIN FALSE");
                for(int i = 0 ;; i++){
                    System.out.print("-error-");
                }
            }
            scanner.close();
        } while (passWord != loginPassWord);

    }
}
