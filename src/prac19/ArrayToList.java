package prac19;

import java.util.Arrays;
import java.util.List;
public class ArrayToList {
    public <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
