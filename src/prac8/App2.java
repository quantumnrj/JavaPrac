package prac8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App2 extends JFrame {
    private File file = null;
    private void setFile(File file) {
        this.file = file;
    }
    private File getFile() {
        return file;
    }
    private boolean Start() {
        System.out.println("Path to image file:");
        String path;
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        File file_image = new File(path);
        setFile(file_image);
        return file_image.exists();
    }
    public App2() {
        boolean work = Start();
        if (work) {
            setTitle("Number 8-2");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int width, height;
            try {
                BufferedImage image = ImageIO.read(getFile());
                if (image != null) {
                    width = image.getWidth();
                    height = image.getHeight();
                    setSize(width, height);
                    Image panel = new Image();
                    panel.setBackgroundImage(image);
                    panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
                    getContentPane().add(panel);
                    pack();
                }
                setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("error while creating window");
            }
        }
        else {
            setFile(null);
            System.out.println("File not found.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App2::new);
    }
}
