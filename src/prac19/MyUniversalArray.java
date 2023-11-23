package prac19;

public class MyUniversalArray<T> {
    private Object[] array;

    public MyUniversalArray(int size) {
        array = new Object[size];
    }
    public void set(int index, T item) {
        array[index] = item;

    }
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }
    public int length() {
        return array.length;
    }
    public static <E> MyUniversalArray<E> of(Class<E> clazz, int size) {
        return new MyUniversalArray<>(size);
    }
}
