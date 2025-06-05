package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello!");
        System.out.println("Welcome to the Cows and Bulls!");
        System.out.println("Please wait, the bot is choosing a number...");
        Thread.sleep(2000);
        String rightNumber = generateFourDigitNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number: ");
        String guess = scanner.nextLine();



        int attempts = 0;


        while () {

        }

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