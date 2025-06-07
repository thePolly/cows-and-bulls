package org.example;
import java.util.*;

public class ConsoleUI  {

    public static void showIntro(Scanner scanner) throws InterruptedException {
        System.out.println("Welcome to the Cows and Bulls!");
        System.out.println("Bulls are the number of right digit and cows represent the number of right digit on right position.");
        System.out.println("Ready? (y/n)");
        String answer = scanner.nextLine();

        while (!answer.equals("y")) {
            System.out.println("Are you ready now?");

            answer = scanner.nextLine();
        }
        showLoadingBar();
    }

    public static void showLoadingBar() throws InterruptedException {
        System.out.print("The bot is choosing a number, please wait [");
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
            Thread.sleep(100);
        }
        System.out.println("]\nReady!");
    }

    public static void printResult(int cows, int bulls){
        System.out.println("Cows: " + cows);
        System.out.println("Bulls: " + bulls);
    };

    public static void printInvalidInputWarning() {
        System.out.println("You have to choose a 4 digit number with different digits!");
        System.out.print("Try again: ");
    };

    public static void displayWinMessage(int attempts) {
            System.out.println("Congratulations! You have won!");
            System.out.println("Number of attempts: " + attempts);
            printSimpleCow();
        }

    public static void printOfferToGuessTheNumber() {
        System.out.print("Guess the number: ");
    }

    private static void printSimpleCow() {
        System.out.println("""
        (__)
        (oo)
 /-------\\/ 
/ |     ||
*  ||----||
   ~~    ~~
    """);
    }
}
