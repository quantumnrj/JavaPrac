package prac12;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DoubleList implements Queue<Integer> {
    private LinkedList<Integer> list = new LinkedList<>();
    @Override
    public boolean add(Integer integer) {
        return list.add(integer);
    }
    @Override
    public boolean offer(Integer integer) {
        return list.offer(integer);
    }
    @Override
    public Integer remove() {
        if (isEmpty()) {
            //throw new IllegalStateException("Queue is empty");
        }
        return list.remove();
    }
    @Override
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        return list.poll();
    }
    @Override
    public Integer element() {
        if (isEmpty()) {
            //throw new IllegalStateException("Queue is empty");
        }
        return list.element();
    }
    @Override
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return list.peek();
    }
    @Override
    public int size() {
        return list.size();
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }
    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }
    public Integer removeIndex(int index) {
        return list.remove(index);
    }
    @Override
    public boolean containsAll(Collection<?> collection) {
        return list.containsAll(collection);
    }
    @Override
    public boolean addAll(Collection<? extends Integer> collection) {
        return list.addAll(collection);
    }
    @Override
    public boolean removeAll(Collection<?> collection) {
        return list.removeAll(collection);
    }
    @Override
    public boolean retainAll(Collection<?> collection) {
        return list.retainAll(collection);
    }
    @Override
    public void clear() {
        list.clear();
    }
    @Override
    public Iterator<Integer> iterator() {
        return list.iterator();
    }
    @Override
    public Object[] toArray() {
        return list.toArray();
    }
    @Override
    public <T> T[] toArray(T[] ts) {
        return list.toArray(ts);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public int get(int i) {
        return this.element();
    }
}
