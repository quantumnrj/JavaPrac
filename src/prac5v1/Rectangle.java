package prac5v1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length){
        this(width, length, "Undefined", false);
    }
    public Rectangle() {
        this(1, 1, "Undefined", false);
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    public String toString(){
        return this.filled + ":filled " + this.color + " rectangle with parameters: " + this.width + " " + this.length;
    }
}
