package com.demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        // Add all alphabet letters to the set
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabetSet.add(letter);
        }

        // Iterate through the input sentence and remove letters from the set
        for (char c : sentence.toCharArray()) {
            alphabetSet.remove(c);
        }

        // If the set is empty, all letters were present in the sentence
        return alphabetSet.isEmpty();
    }
}
