package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        Mono<Integer> monoInteger = ReactiveSources.intNumberMono();
        monoInteger.subscribe(e -> System.out.println(e));

        // Get the value from the Mono into an integer variable
        Optional<Integer> num = monoInteger.blockOptional();
        if (num.isPresent()) {
            System.out.println("num:" + num.get());
        } else {

            System.out.println("num:" + -1);
        }
        System.out.println("Press a key to end");
        System.in.read();
    }

}
