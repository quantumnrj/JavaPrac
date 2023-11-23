package prac5v1;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        this.color = "Undefined";
        this.filled = false;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
