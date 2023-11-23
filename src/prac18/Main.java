package prac18;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        TestClass object2 = new TestClass("test", new Cat(), 15);
        object2.PrintClass(object2);
        ArrayList<Integer> array = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++){
            array.add(i);
        }
        MinMax minmax = new MinMax(array);
        System.out.println(minmax.getMin());
        System.out.println(minmax.getMax());

        Integer[][] matrixData1 = {{1, 2}, {3, 4}};
        Integer[][] matrixData2 = {{5, 6}, {7, 8}};
        MyMatrix<Integer> matrix1 = new MyMatrix<>(matrixData1);
        MyMatrix<Integer> matrix2 = new MyMatrix<>(matrixData2);

        try {
            MyMatrix<Integer> sumResult = matrix1.add(matrix2);
            MyMatrix<Integer> productResult = matrix1.multiply(matrix2);
            sumResult.dataToString();
            productResult.dataToString();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}