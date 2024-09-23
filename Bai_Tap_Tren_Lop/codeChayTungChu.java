/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_Tap_Tren_Lop;

/**
 *
 * @author Admin
 */
public class codeChayTungChu {
    
    public static void main(String[] args) throws InterruptedException {
        String message = "Super Idol nở nụ cười \n"
                + "chẳng ngọt bằng cậu đâu \n"
                + "cái nắng chói chang giữa tháng tám \n"
                + "cũng không toả nắng bằng cậu \n"
                + "nhiệt tâm của cậu \n"
                + "như từng giọt nước cất thuần khiết \n";
        
        for (int i = 0; i < message.length(); i++) {
            // In từng ký tự một
            System.out.print(message.charAt(i));
            
            // Dừng lại 100 milliseconds trước khi in ký tự tiếp theo
            Thread.sleep(250);
        }
    
}
}
