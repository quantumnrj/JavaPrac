package prac16;
public class Exception1 {
    public void exceptionDemo() {
        // infinity generation
        System.out.println(2.0/0);
        try{
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}