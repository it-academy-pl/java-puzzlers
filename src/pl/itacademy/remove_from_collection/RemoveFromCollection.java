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

        //task - remove all elements from collection, size should equal to 0
        System.out.println(listOfIntegers.size());


    }
}