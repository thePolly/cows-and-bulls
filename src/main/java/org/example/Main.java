package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to the Cows and Bulls!");
        System.out.println("Please wait, the bot is choosing a number...");
        Thread.sleep(2000);
        String rightNumber = generateFourDigitNumber();

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Guess the number: ");
            String guess = scanner.nextLine();

            while (!isValidNumber(guess)) {
                System.out.println("You have to choose a 4 digit number with different digits!");
                System.out.print("Try again: ");
                guess = scanner.nextLine();
            }
            attempts ++;

            if (guess.equals(rightNumber)) {
                System.out.println("Congratulations! You have won! /n Number of attempts: " + attempts);
                return;
            }

            int cows = countCows(rightNumber, guess);
            int bulls = countBulls(rightNumber, guess) - cows;

            System.out.println("Cows: " + cows);
            System.out.println("Bulls: " + cows);


        }

    }

    public static int countCows(String rightNumber, String guess){
        return 0;
    }
    public static int countBulls(String rightNumber, String guess){
        return 0;
    }

    public static boolean isValidNumber(String number) {
        return true;
    }

    public static String generateFourDigitNumber() {
        Random random = new Random();
        Set<Integer> digits = new HashSet<>();
        StringBuilder result = new StringBuilder();
        while (result.length() < 4) {
            int digit = random.nextInt(10);
            if (digits.isEmpty() && digit == 0) continue;
            if (!digits.contains(digit)) {
                digits.add(digit);
                result.append(digit);
            }
        }
        return result.toString();
    }
}