package pl.itacademy.composition_over_inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// Broken - Inappropriate use of inheritance!
public class ExtendedHashSet<E> extends HashSet<E> {

    // The number of attempted element insertions
    private int addCount = 0;

    public ExtendedHashSet() {
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        ExtendedHashSet<String> s = new ExtendedHashSet<>();
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        s.addAll(list);
        System.out.println("Added " + s.getAddCount() + " elements");
    }

}
