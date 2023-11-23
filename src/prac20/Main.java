package prac20;
import java.util.Stack;

public class Main {
    public static double calculate(String[] Expression) {
        Stack<Double> stack = new Stack<>();
        for (String element : Expression) {
            switch (element) {
                case "+":
                    double temp1 = stack.pop();
                    double temp2 = stack.pop();
                    //System.out.println(temp1 + "+" + temp2);
                    stack.push(temp1 + temp2);
                    break;
                case "-":
                    double a = stack.pop();
                    double b = stack.pop();
                    //System.out.println(b + "-" + a);
                    stack.push(b - a);
                    break;
                case "*":
                    double temp3 = stack.pop();
                    double temp4 = stack.pop();
                    //System.out.println(temp3 + "*" + temp4);
                    stack.push(temp3 * temp4);
                    break;
                case "/":
                    double delitel = stack.pop();
                    double delimoe = stack.pop();
                    //System.out.println(delimoe + "/" + delitel);
                    if (delitel == 0) throw new IllegalArgumentException("Cannot divide by zero.");
                    stack.push(delimoe / delitel);
                    break;
                default:
                    stack.push(Double.parseDouble(element));
                    break;
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] expression = {"2", "3", "4", "5", "6", "*", "+", "-", "/"};
        double result = calculate(expression);
        System.out.println("Result is " + result);
    }
}