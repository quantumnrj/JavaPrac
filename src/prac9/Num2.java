package prac9;

public class Num2 {
    private Product[] array;
    public Num2(int size_shop) {
        array = new Product[size_shop];
    }
    public void add_to_end(Product product) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = product;
                break;
            }
        }
    }

    public Product[] getArray() {
        return array;
    }
    public void delete_by_index(int index) {
        if (index >= array.length) {
            System.out.println("Error");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    array[i] = null;
                    break;
                }
            }
            boolean f = true;
            while (f) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] == null && array[i+1] != null) {
                        array[i] = array[i+1];
                        array[i+1] = null;
                        break;
                    }
                    if (array[i] == null && array[i+1] == null && i == array.length - 1) {
                        f = false;
                    }
                }
            }
        }
    }
    public void print() {
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}
