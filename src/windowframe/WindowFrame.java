package windowframe;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.lang.constant.Constable;
import java.net.URL;
import java.util.Objects;

public class WindowFrame {
    public static void main(String[] args) {
        createWindow();
    }

    public static void createWindow() {
        JFrame frame = new JFrame("Frame");
        JLabel emptyLabel = new JLabel("Hello World!");

        ClassLoader classLoader = WindowFrame.class.getClassLoader();
        ImageIcon img = new ImageIcon(Objects.requireNonNull(classLoader.getResource("windowframe/resources/icon.png")));

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.setIconImage(img.getImage());

        //Display window
        frame.setSize(320, 180);
        frame.setVisible(true);

    }
}
