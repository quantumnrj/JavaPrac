package Restaurant;

public interface Order {
    boolean add(MenuItem item);
    boolean remove(String name);
    int removeAll(String name);
    int Quantity();
    MenuItem[] GetItem();
    float priceTotal();
    int totalItem(String name);
    String[] GetOrderNames();
    MenuItem[] sorted_totalItem();
}
