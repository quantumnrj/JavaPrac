package prac12;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class DequeueList implements Deque<Integer> {
    private Stack<Integer> list = new Stack<>();
    @Override
    public void addFirst(Integer integer) {
        list.add(0, integer);
    }

    @Override
    public void addLast(Integer integer) {
        list.add(integer);
    }

    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer removeFirst() {
        return list.remove(0);
    }

    @Override
    public Integer removeLast() {
        if (list.size() > 0)
            return list.remove(list.size() - 1);
        return null;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer getFirst() {
        if (list.size() > 0) return list.get(0);
        return null;
    }

    @Override
    public Integer getLast() {
        if (list.size() > 0) return list.get(list.size() - 1);
        return null;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Integer integer) {
        addLast(integer);
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return list.get(0);
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void push(Integer integer) {
        addLast(integer);
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() <= 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    public void removeIndex(int index) {
        list.remove(index);
    }
    @Override
    public Iterator<Integer> descendingIterator() {
        return null;
    }
}
