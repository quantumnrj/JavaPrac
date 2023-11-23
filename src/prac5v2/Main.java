package prac5v2;

public class Main {
    public static void main(String[] args) {
        MovableCircle obj7 = new MovableCircle(0, 0, 2, 1, 1);
        System.out.println(obj7.toString() + "\nmoving up...");
        obj7.moveUp();
        System.out.println(obj7.toString() + "\nmoving down...");
        obj7.moveDown();
        System.out.println(obj7.toString() + "\nmoving left...");
        obj7.moveLeft();
        System.out.println(obj7.toString() + "\nmoving right...");
        obj7.moveRight();
        System.out.println(obj7.toString() + "\n");

        MovableRectangle mr = new MovableRectangle(0, 5, 0, 5, 5, 5);
        System.out.println(mr.toString() + "\nmoving up...");
        mr.moveUp();
        System.out.println(mr.toString() + "\nmoving down...");
        mr.moveDown();
        System.out.println(mr.toString() + "\nmoving left...");
        mr.moveLeft();
        System.out.println(mr.toString() + "\nmoving right...");
        mr.moveRight();
        System.out.println(mr.toString());
    }
}
