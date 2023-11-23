package prac18;

public class MyCalculator {
    public MyCalculator() {}
    public Double sum (double a, double b) {return a + b;}
    public Double subtract (double a, double b) {return a - b;}
    public Double multiply (double a, double b) {return a * b;}
    public Double divide (double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0.0;
        }
    }
}
