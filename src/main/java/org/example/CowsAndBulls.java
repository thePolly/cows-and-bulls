package org.example;
import java.util.*;

public class CowsAndBulls {

    private String rightNumber;
    private int numberOfAttempts;

    public CowsAndBulls() {
        this.numberOfAttempts = 0;
        this.rightNumber = generateNumber();
    }

    public String getRightNumber() {
        return rightNumber;
    }

    public int getNumberOfAttempts() {
        return  numberOfAttempts;
    }

    public boolean isCorrect(String guessedNumber) {
        numberOfAttempts++;
        return guessedNumber.equals(rightNumber);
    }

    public boolean isValidNumber(String number) {
        if (number.length() != 4) return false;

        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }

        Set<Character> set = new HashSet<>();
        for (char c : number.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public String generateNumber() {
        Random random = new Random();
        Set<Integer> digits = new HashSet<>();
        StringBuilder result = new StringBuilder();
        while (result.length() < 4) {
            int digit = random.nextInt(10);
            if (digits.isEmpty() && digit == 0)
                continue;
            if (!digits.contains(digit)) {
                digits.add(digit);
                result.append(digit);
            }
        }
        return result.toString();
    }

    public int countCows(String rightNumber, String guessedNumber){
        int cows = 0;
        for (int i = 0; i < rightNumber.length(); i++) {
            if (rightNumber.charAt(i) == guessedNumber.charAt(i)) {
                cows++;
            }
        }
        return cows;
    }
    public int countBulls(String rightNumber, String guessedNumber){
        int bulls = 0;
        for (char c : guessedNumber.toCharArray()) {
            if (rightNumber.contains(String.valueOf(c))) {
                bulls++;
            }
        }
        return bulls - countCows(rightNumber, guessedNumber);
    }
}
