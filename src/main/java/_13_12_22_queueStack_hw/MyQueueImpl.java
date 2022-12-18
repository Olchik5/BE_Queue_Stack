package _13_12_22_queueStack_hw;

import java.util.ArrayList;


public class MyQueueImpl<T> implements MyQueue<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}