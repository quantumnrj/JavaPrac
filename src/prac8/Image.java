package prac8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Image extends JPanel {
    public BufferedImage backgroundImage;
    public void setBackgroundImage(BufferedImage img) {
        backgroundImage = img;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, null);
        }
    }
}
