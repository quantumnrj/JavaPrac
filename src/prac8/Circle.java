package prac8;

import java.awt.*;
public class Circle extends Shape {
    private int radius;
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        setRadius(radius);
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX() - getRadius(), getY() - getRadius(), 2 * getRadius(), 2 * getRadius());
    }
}
