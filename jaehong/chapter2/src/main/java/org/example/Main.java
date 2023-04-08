package org.example;

import static java.lang.System.out;

import java.io.Console;
import java.util.Collections;
import java.util.List;
import jdk.internal.misc.SharedSecrets;

public class Main {
    public static void main(String[] args) {
        final var console = System.console();
        SharedSecrets.getJavaIOAccess().console();

        if(console == null){
            out.println("console is null");
            return;
        }
        console.printf("hello");
    }
}