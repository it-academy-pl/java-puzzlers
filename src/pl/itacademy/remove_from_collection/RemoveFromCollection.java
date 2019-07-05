package pl.itacademy.remove_from_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://www.baeldung.com/java-concurrentmodificationexception
//https://stackoverflow.com/questions/24485348/reason-for-concurrentmodificationexception-on-arraylists-iterator-next
public class RemoveFromCollection {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            listOfIntegers.add(i);
        }

        //1. print all integers using streams
        listOfIntegers.stream().forEach(System.out::println);

        //2. remove only even numbers from collection
/*        for (Integer value : listOfIntegers) {

                listOfIntegers.remove(value);
            }
        }*/

/*        for(Iterator<Integer> value = listOfIntegers.iterator(); value.hasNext(); ) {
            if(value%2==0) {
            Integer element = value.next();
            listOfIntegers.remove(element);
            }
        }*/

        for (Iterator<Integer> iterator = listOfIntegers.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if(integer % 2 == 0) {
                iterator.remove();
            }
        }

        listOfIntegers.stream().forEach(System.out::println);

    }
}
