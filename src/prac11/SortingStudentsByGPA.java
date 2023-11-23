package prac11;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private static Comparator[] array;
    public SortingStudentsByGPA(int size) {
        array = new Comparator[size];
    }
    public void add_data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student name");
        String name = sc.nextLine();
        System.out.println("Student grade");
        double bal = sc.nextDouble();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = new Comparator(name, bal);
                break;
            }
        }
    }
    public void sort() {
        QuickSort(array, 0, array.length - 1);
    }
    public void QuickSort(Comparator[] students, int low, int high) {
        if (students == null || students.length == 0)
            System.out.println("rec end");
        else if (low >= high)
            System.out.println("rec end");
        else {
            int middle = low + (high - low) / 2;
            double pivot = students[middle].getScore();
            int i = low, j = high;
            while (i <= j) {
                while (students[i].getScore() > pivot) {
                    i++;
                }
                while (students[j].getScore() < pivot) {
                    j--;
                }
                if (i <= j) {
                    Comparator temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j) {
                QuickSort(students, low, j);
            }
            if (high > i) {
                QuickSort(students, i, high);
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
}