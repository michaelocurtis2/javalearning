package windowframe;

import javax.swing.*;
import java.awt.*;

public class WindowFrame {
    public static void main(String[] args) {
        createWindow();
    }

    public static void createWindow() {
        JFrame frame = new JFrame("Frame");
        JLabel emptyLabel = new JLabel("Frame");

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display window
        frame.setSize(320, 180);
        frame.setVisible(true);

    }
}
