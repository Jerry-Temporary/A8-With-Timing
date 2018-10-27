package assignment8;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class BSTTimer {

	static Random rand = new Random();

	public static void main(String[] args) {
		timeAdd();
	}

	private static void timeAdd() {
		long startTime, midpointTime, stopTime;

		startTime = System.nanoTime();
		while (System.nanoTime() - startTime < 1000000000) { // empty block to warm the system up
		}

		for (int n = 1000; n <= 20000; n += 1000) { // Track length of ArrayLists passed into the sort algorithms

			//BinarySearchTree<Integer> timer = new BinarySearchTree<Integer>();
			TreeSet<Integer> timer = new TreeSet<Integer>();
			int[] values = new int[n];

			long numberOfTests = 1000; // Tests per input value
			
			//generate numbers to add
			for (int i = 0; i < n; i++) {
				values[i] = randomInteger();
				//values[i] = i;
			}

			startTime = System.nanoTime();

			for (long i = 0; i < numberOfTests; i++) { // Number of tests. Test goes in here.
				for (Integer value : values) {
					timer.add(value);
				}
			}
			
			midpointTime = System.nanoTime();

			// Run an empty loop to capture the cost of running the loop.

			for (long i = 0; i < numberOfTests; i++) { // These loops are here to negate the time spent doing things
				for (Integer value : values) {
					
				}
			}

			stopTime = System.nanoTime();

			double averageTime = ((midpointTime - startTime) - (stopTime - midpointTime)) / numberOfTests;
			
			
			
			

			// System.out.println(n + "\t"+ averageTime); // Print my results here
			System.out.println(averageTime); // Print my results here

		}
	}

	public static Integer randomInteger() {
		return rand.nextInt();
	}

}
