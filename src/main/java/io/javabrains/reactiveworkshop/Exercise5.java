package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
//        ReactiveSources.intNumbersFlux().subscribe(
//                e -> System.out.println(e),
//                err -> System.out.println(err.getMessage()),
//                () -> System.out.println("Completed")
//        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("subscribe happened");
        request(1);
    }

    public void hookOnNext(T value) {
        System.out.println("value:" + value.toString());
        request(1);
    }
}