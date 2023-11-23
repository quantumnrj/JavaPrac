package prac11;
import java.util.Scanner;

public class SortedNum3 {
    private static Comparator[] array;
    public SortedNum3(int size) {
        array = new Comparator[size];

    }
    public void add_data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student name");
        String name = sc.nextLine();
        System.out.println("Student score");
        double bal = sc.nextDouble();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = new Comparator(name, bal);
                break;
            }
        }
    }
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Comparator comparator : array) {
            text.append(comparator.toString());
            text.append("\n");
        }
        return text.toString();
    }
    public void print() {
        System.out.print(this);
    }
    public void sort() {
        SelectionSort(array);
    }
    public void SelectionSort(Comparator[] list) {
        int min;
        Comparator temp;
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for (int scan = index+1; scan < list.length; scan++){
                if (list[scan].compareTo(list[min]) < 0){
                    min = scan;
                }
                temp = list[min];
                list[min] = list[index];
                list[index] = temp;
            }
        }
    }
}
