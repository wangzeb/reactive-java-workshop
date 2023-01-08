package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        //

        // Print numbers from intNumbersStream that are less than 5
        // StreamSources.intNumbersStream().filter(i -> i < 5).forEach(i -> System.out.println(i));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        //StreamSources.intNumbersStream().limit(3).skip(1).filter(i -> i > 5).forEach(i -> System.out.println(i));
        StreamSources.intNumbersStream().filter(i -> i > 5).skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // System.out.println(StreamSources.intNumbersStream().filter(i -> i > 5).findFirst().orElse(-1));

        // Print first names of all users in userStream
        // StreamSources.userStream().forEach(u -> System.out.println(u.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
//        StreamSources.userStream()
//                .filter(u -> StreamSources.intNumbersStream().anyMatch(i -> i == u.getId()))
//                .forEach(u -> System.out.println(u.getFirstName()));

    }

}
