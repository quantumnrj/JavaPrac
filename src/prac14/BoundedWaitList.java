package prac14;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;
    BoundedWaitList(int capacity) {
        this.capacity = capacity;
        content = new ConcurrentLinkedQueue<>();
    }
    private int getCapacity() {
        return capacity;
    }
    @Override
    public void add(E element) {
        if (content.size() < getCapacity()) content.add(element);
    }
    @Override
    public String toString() {return content.toString() + "\nBoundedWaitList";}
}