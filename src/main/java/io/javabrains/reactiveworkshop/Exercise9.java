package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        //ReactiveSources.intNumbersFlux().count().subscribe(System.out::println);

        // Collect all items of intNumbersFlux into a single list and print it
        //ReactiveSources.intNumbersFlux().collectList().subscribe(System.out::println);

        // Transform to a sequence of sums of adjacent two numbers
        ReactiveSources.intNumbersFlux().buffer(2).
                map(e -> {
                            Integer second = 0;
                            if (e.size() == 2)
                                second = e.get(1);
                            return e.get(0) + second;
                        }
                ).subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
