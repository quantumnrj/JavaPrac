package prac8;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App3 extends JFrame {
    private JLabel imageLabel;
    private File[] imageFiles;
    private int currentImageIndex;
    public App3(String folderPath) {
        setTitle("Number 8_3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        File folder = new File(folderPath);
        imageFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".bmp") ||
                name.toLowerCase().endsWith(".png") || name.toLowerCase().endsWith(".jpg"));
        if (imageFiles == null || imageFiles.length == 0) {
            System.exit(0);
        }
        imageLabel = new JLabel();
        add(imageLabel);
        currentImageIndex = 0;
        displayNextImage();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                displayNextImage();
            }
        }, 400, 400);
        setVisible(true);
    }
    private void displayNextImage() {
        if (currentImageIndex >= imageFiles.length) {
            currentImageIndex = 0;
        }
        ImageIcon imageIcon = new ImageIcon(imageFiles[currentImageIndex].getAbsolutePath());
        imageLabel.setIcon(imageIcon);
        currentImageIndex++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input path from image files:");
        String path = sc.nextLine();
        System.out.println(path);
        SwingUtilities.invokeLater(() -> new App3(path));
    }
}
