package prac18;

import java.util.ArrayList;

public class MinMax<E extends Comparable> {
    private ArrayList<E> array;

    public MinMax(ArrayList<E> array) {
        this.array = array;
    }

    public E getMin() {
        E output = null;
        if(!array.isEmpty()) output = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (output.compareTo(array.get(i)) < 0) {
                output = array.get(i);
            }
        }
        return output;
    }

    public E getMax() {
        E output = null;
        if(!array.isEmpty()) output = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (output.compareTo(array.get(i)) > 0) {
                output = array.get(i);
            }
        }
        return output;
    }
}
