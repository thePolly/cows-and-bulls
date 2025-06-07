package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        Scanner scanner = new Scanner(System.in);
        ConsoleUI.showIntro(scanner);
        CowsAndBulls game = new CowsAndBulls();

        while (true) {
            ConsoleUI.printOfferToGuessTheNumber();
            String guess = scanner.nextLine();

            while (!game.isValidNumber(guess)) {
                ConsoleUI.printInvalidInputWarning();
                guess = scanner.nextLine();
            }

            if (game.isCorrect(guess)) {
                ConsoleUI.displayWinMessage(game.getNumberOfAttempts());
                return;
            }

            int cows = game.countCows(game.getRightNumber(), guess);
            int bulls = game.countBulls(game.getRightNumber(), guess);

            ConsoleUI.printResult(cows, bulls);


        }

    }



}