package effectivejava.item29;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class MyStackGenericList<E> {
    private List<E> elements;
    // no longer need these variables
    // private int size = 0;
    // private static final int DEFAULT_INITIAL_CAPTIVITY = 16;

    public MyStackGenericList() {
        elements = new ArrayList<E>();
    }

    public void push(E e) {
        // unnecessary function
        // ensureCapacity();
        elements.add(e);
    }

    public E pop() {
        if(elements.size() == 0)
            throw new EmptyStackException();
        E result = elements.get(elements.size() - 1);
        elements.remove(elements.size()-1);
        return result;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // No longer need this function
    /* private void ensureCapacity() {
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2*size+1); //expands array
    } */
}