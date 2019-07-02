package pl.itacademy.remove_from_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromCollection {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            listOfIntegers.add(i);
        }

        for (Integer value : listOfIntegers) {
            listOfIntegers.remove(value);
        }

/*        for(Iterator<Integer> value = listOfIntegers.iterator(); value.hasNext(); ) {
            Integer element = value.next();
            listOfIntegers.remove(element);
        }*/

    }
}
