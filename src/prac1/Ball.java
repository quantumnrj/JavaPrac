package prac1;

public class Ball {
    String color;
    int size;
    public Ball(String color, int size){
        this.color = color;
        this.size = size;
    }
    public Ball(String color){
        this(color, 10);
    }
    public Ball(int size){
        this("white", size);
    }
    public Ball(){
        this("white", 10);
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public int getSize() {
        return this.size;
    }
    public String toString(){
        return this.color + " ball, size " + this.size;
    }
}