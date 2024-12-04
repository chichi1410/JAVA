import javax.swing.*;
import java.awt.*;

public class RomanticHeart extends JPanel implements Runnable {
    private int x = 200;   // Tọa độ x ban đầu
    private int y = 150;   // Tọa độ y ban đầu
    private double scale = 1.0; // Tỷ lệ co giãn (trái tim đập)
    private boolean expanding = true; // Trái tim đang mở rộng hay thu nhỏ

    public RomanticHeart() {
        Thread thread = new Thread(this);
        thread.start(); // Khởi chạy animation
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Bật hiệu ứng khử răng cưa
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Tạo màu gradient phát sáng
        GradientPaint gradient = new GradientPaint(
                x + 50, y, Color.PINK,
                x + 100, y + 100, Color.RED, true);
        g2d.setPaint(gradient);

        // Scale trái tim (tăng giảm kích thước)
        g2d.scale(scale, scale);

        // Vẽ trái tim
        g2d.fillArc(x, y, 50, 50, 0, 180); // Nửa vòng cung trái
        g2d.fillArc(x + 50, y, 50, 50, 0, 180); // Nửa vòng cung phải
        int[] triangleX = {x, x + 100, x + 50};
        int[] triangleY = {y + 25, y + 25, y + 100};
        g2d.fillPolygon(triangleX, triangleY, 3);
    }

    @Override
    public void run() {
        while (true) {
            // Điều chỉnh scale để tạo hiệu ứng "đập" trái tim
            if (expanding) {
                scale += 0.01;
                if (scale >= 1.2) expanding = false; // Giảm khi đạt kích thước tối đa
            } else {
                scale -= 0.01;
                if (scale <= 1.0) expanding = true; // Tăng trở lại khi thu nhỏ
            }

            repaint(); // Cập nhật lại giao diện
            try {
                Thread.sleep(50); // Tốc độ animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Romantic Heart");
        RomanticHeart heart = new RomanticHeart();

        // Cài đặt khung JFrame
        frame.add(heart);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
