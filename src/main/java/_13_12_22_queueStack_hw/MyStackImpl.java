package _13_12_22_queueStack_hw;

import java.util.ArrayList;

public class MyStackImpl<T> implements MyStack <T>{
    private ArrayList<T> list = new ArrayList<>();


    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
