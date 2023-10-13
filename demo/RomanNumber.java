package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInt(romanNumeral);
        if (result != -1) {
            System.out.println("Integer value: " + result);
        } else {
            System.out.println("Invalid Roman numeral input.");
        }

        scanner.close();
    }

    public static int romanToInt(String s) {
        // Create a mapping of Roman numeral symbols to their integer values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;  // To keep track of the previous Roman numeral value

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

}
