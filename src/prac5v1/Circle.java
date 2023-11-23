package prac5v1;
public class Circle extends Shape {
    private double radius;
    public Circle(){
        this(1);
    };
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.141596 * radius * radius;
    }
    public double getPerimeter(){
        return 2 * 3.141596 * radius;
    }
    public String toString(){
        return this.filled + ":filled " + this.color +
                " circle with radius of " + this.radius;
    }
}
