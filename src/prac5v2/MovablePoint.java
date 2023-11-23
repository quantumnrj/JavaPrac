package prac5v2;

class MovablePoint implements Movable {
    private int x = 0;
    private int y = 0;
    private int speedX = 0;
    private int speedY = 0;
    MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public int getSpeedX(){
        return this.speedX;
    }
    public int getSpeedY(){
        return this.speedY;
    }
    public void moveUp() {
        this.y += this.speedY;
    }
    public void moveDown() {
        this.y -= this.speedY;
    }
    public void moveLeft() {
        this.x -= this.speedX;
    }
    public void moveRight() {
        this.x += this.speedX;
    }
    public String toString() {
        return "X " + this.x + " Y " + this.y + " xSpeed " + this.speedX + " ySpeed " + this.speedY;
    }
}
