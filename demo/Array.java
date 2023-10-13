package com.demo;

import java.util.Arrays;
import java.util.Random;

public class Array {

	 public static void main(String[] args) {
	        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
	        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

	        // Shuffle the array
	        shuffleArray(originalArray);

	        // Print the shuffled array
	        System.out.println("Shuffled array: " + Arrays.toString(originalArray));
	    }

	    // Helper function to shuffle an array
	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random rand = new Random();

	        for (int i = n - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);

	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
}
