package com.desire.game;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    String username = "";
    Double goodpoints = 0.0;

    public static void main(String[] args) {
        Main main = new Main();
        main.welcome();
        main.intro();
        // main.checkname();
    }

    public void welcome() {
        System.out.println("Welcome to Desire's first ever game!");
        System.out.println("Type 'hi' to continue!");
        String firstInput = scanner.nextLine();
        if (firstInput.equals("hi")) {
            System.out.println("Welcome! Everything is fine.");
            goodpoints = goodpoints + 0.5;
        }
        else {
            System.out.println("You're not off to a good start, buddy.");
            goodpoints = goodpoints - 0.5;
        }
    }

    public void intro() {
        // Introduction.
        System.out.println("Now tell us, what's your name?");
        username = scanner.nextLine();
        System.out.println("Nice to meet you, " + username + "!");
        System.out.println("You have " + goodpoints + " good points.");

    }

    /* public void checkname() {
        System.out.println("Here's your name!");
        System.out.println(username);

    } */
}
