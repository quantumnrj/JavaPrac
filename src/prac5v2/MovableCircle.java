package prac5v2;

class MovableCircle implements Movable {
    private int radius = 0;
    private final MovablePoint center;
    MovableCircle(int x, int y, int speedX, int speedY, int radius) {
        this.center = new MovablePoint(x, y, speedX, speedY);
        this.radius = radius;
    }
    public String toString() {
        return "Circle with center " + this.center.toString() + " And radius " + this.radius;
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
}
