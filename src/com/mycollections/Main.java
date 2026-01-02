/**
 *  Java program to remove elements PriorityQueue.
 */

package com.mycollections;

import java.util.PriorityQueue;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a PriorityQueue instance.
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        // Adding elements to myQueue
        myQueue.add("Coffee");
        myQueue.add("Tea");
        myQueue.add("Coffee");

        // Printing elements of myQueue.
        System.out.println("Initial queue " + myQueue); // Output: [Coffee, Tea, Coffee]

        // Removing Coffee from myQueue using method remove()
        myQueue.remove("Coffee");

        // Printing elements of myQueue.
        System.out.println("Queue after remove: " + myQueue); // Output: [Coffee, Tea]

        // Using method poll()
        myQueue.poll();

        // Printing elements of myQueue.
        System.out.println("Final queue: " + myQueue); // Output: [Tea]

    }
}