package pl.itacademy.composition_over_inheritance;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class DecoratedSet<E> implements Set<E> {
    private Set<E> set;

    public DecoratedSet(Set<E> set) {
        this.set = set;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return set.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return set.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean equals(Object o) {
        return set.equals(o);
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public Spliterator<E> spliterator() {
        return set.spliterator();
    }

    public static <E1> Set<E1> of() {
        return Set.of();
    }

    public static <E1> Set<E1> of(E1 e1) {
        return Set.of(e1);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2) {
        return Set.of(e1, e2);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3) {
        return Set.of(e1, e2, e3);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4) {
        return Set.of(e1, e2, e3, e4);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5) {
        return Set.of(e1, e2, e3, e4, e5);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5, E1 e6) {
        return Set.of(e1, e2, e3, e4, e5, e6);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5, E1 e6, E1 e7) {
        return Set.of(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5, E1 e6, E1 e7, E1 e8) {
        return Set.of(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5, E1 e6, E1 e7, E1 e8, E1 e9) {
        return Set.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E1> Set<E1> of(E1 e1, E1 e2, E1 e3, E1 e4, E1 e5, E1 e6, E1 e7, E1 e8, E1 e9, E1 e10) {
        return Set.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    @SafeVarargs
    public static <E1> Set<E1> of(E1... elements) {
        return Set.of(elements);
    }

    public static <E1> Set<E1> copyOf(Collection<? extends E1> coll) {
        return Set.copyOf(coll);
    }
}
