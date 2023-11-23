package prac5v1;

public class Square extends Rectangle{
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    Square(double side){
        super(side, side);
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public String toString(){
        return this.filled + ":filled " + this.color + " square with side of " + this.width;
    }
}
