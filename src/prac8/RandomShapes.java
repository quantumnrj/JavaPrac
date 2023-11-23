package prac8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(2);
            int x = random.nextInt(400);
            int y = random.nextInt(500);
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            if (shapeType == 0) {
                int radius = random.nextInt(50) + 20;
                Circle circle = new Circle(color, x, y, radius);
                circle.draw(g);
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                Rectangle rectangle = new Rectangle(color, x, y, width, height);
                rectangle.draw(g);
            }
        }
    }
}
