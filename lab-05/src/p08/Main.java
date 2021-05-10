package p08;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    CanvasPanel mainPanel;

    // layout
    Main() {
        setLayout(new BorderLayout());

        mainPanel = new CanvasPanel();
        add(mainPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("Chessboard");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            // chessboard
            int widthCell = getWidth() / 8;
            int heightCell = getHeight() / 8;

            for (int col = 0; col < 8; col++) {
                for (int row = 0; row < 8; row++) {
                    if ((row + col) % 2 == 1) {
                        g.setColor(Color.WHITE);
                    } else {
                        g.setColor(Color.DARK_GRAY);
                    }
                    g.fillRect(col * widthCell, row * heightCell, widthCell, heightCell);
                }

            }
        }
    }
}
