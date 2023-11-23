package prac5v2;

class MovableRectangle implements Movable {
    private MovablePoint p1;
    private MovablePoint p2;
    private int length;
    private int widgth;

    MovableRectangle(int x1, int x2, int y1, int y2, int speedX, int speedY) {
        p1 = new MovablePoint(x1, y1, speedX, speedY);
        p2 = new MovablePoint(x2, y2, speedX, speedY);
        length = Math.abs(y2 - y1);
        widgth = Math.abs(x2 - x1);
    }
    public int getLength() {
        return length;
    }
    public int getWidgth() {
        return widgth;
    }
    public void moveUp() {
        if (this.checkSpeed()){
            p1.moveUp();
            p2.moveUp();
        }
    }
    public void moveDown() {
        if (this.checkSpeed()){
            p1.moveDown();
            p2.moveDown();
        }
    }
    public void moveLeft() {
        if (this.checkSpeed()){
            p1.moveLeft();
            p2.moveLeft();
        }
    }
    public void moveRight() {
        if (this.checkSpeed()){
            p1.moveRight();
            p2.moveRight();
        }
    }
    public boolean checkSpeed() {
        return p1.getSpeedX() == p2.getSpeedX() && p1.getSpeedY() == p2.getSpeedY();
    }
    public String toString() {
        return "Rectangle with corner: " + p1.toString() + " And corner: " + p2.toString();
    }
}
