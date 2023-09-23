package ge.mycompany;

import java.util.*;

public class ConstantTimeDeletionList<T> {
    private List<T> list;

    public ConstantTimeDeletionList() {
        list = new ArrayList<>();
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        if (list.contains(element)) {
            int index = list.indexOf(element);
            int lastIndex = list.size() - 1;

            // Swap element with last element
            T lastElement = list.get(lastIndex);
            list.set(index, lastElement);

            // Remove last element
            list.remove(lastIndex);
        }
    }

}
