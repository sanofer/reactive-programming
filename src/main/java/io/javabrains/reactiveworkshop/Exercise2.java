package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));
        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
