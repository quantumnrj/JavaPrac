package prac8;

import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;
    public Shape(Color color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public abstract void draw(Graphics g);
}