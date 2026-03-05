import javax.swing.*;
import java.awt.*;

public class Frontend extends JFrame {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;

    private static final int HEADER_FONT_SIZE = 50;
    private static final int NORMAL_FONT_SIZE = 20;

    private String birthMonth;
    private String birthDay;
    private String birthYear;

    private Backend backend;

    public Frontend(Backend backend) {
        this.backend = backend;

        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("Work Together");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void results(String birthMonth, String birthDay, String birthYear) {
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        // Set the background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        // About You
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, HEADER_FONT_SIZE));
        g.drawString("About You", (WINDOW_WIDTH/2)-(HEADER_FONT_SIZE*2), 200);

        g.drawString();
    }
}
