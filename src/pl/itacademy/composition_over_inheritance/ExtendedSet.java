package pl.itacademy.composition_over_inheritance;

import java.util.*;

// Broken - Inappropriate use of inheritance!
public class ExtendedSet<E> extends DecoratedSet<E> {

    // The number of attempted element insertions
    private int addCount = 0;

    public ExtendedSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        ExtendedSet<String> s = new ExtendedSet<>(new HashSet<>());
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        s.addAll(list);
        // question: what do you expect to be returned when getAddCount() is invoked?
        // what is actually returned?
        // why?

        System.out.println(s.getAddCount());
    }
}