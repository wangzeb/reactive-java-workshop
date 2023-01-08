package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<Integer> s = ReactiveSources.intNumbersFlux().toStream().toList();
        s.forEach(e -> System.out.println(e));

        System.out.println(s.size());

       
    }

}
