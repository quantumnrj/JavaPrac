package prac4;

public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY){
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    public Circle(double radius){
        this(radius, 0, 0);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }
    public double getCenterY() {
        return centerY;
    }
    public double getCenterX() {
        return centerX;
    }
    public double getRadius() {
        return radius;
    }
    public String toString(){
        return "Circle with radius of " + this.radius +
                " and center in " + this.centerX +
                " " + this.centerY;
    }
}
