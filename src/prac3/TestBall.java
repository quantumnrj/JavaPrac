package prac3;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10,10);
        b1.setX(15);
        b1.setY(5);
        System.out.println(b1.toString());
        b1.move(5,15);
        System.out.println(b1.toString());
    }
}

