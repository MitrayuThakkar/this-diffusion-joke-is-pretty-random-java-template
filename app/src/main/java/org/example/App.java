package org.example;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        int[] stepOptions = {10, 20, 50, 100, 200}; // Values of N
        int trials = 10; // M value
        Random rand = new Random();

        System.out.printf("%-20s %-20s %-20s%n", "Number of Steps (N)", "Trial Number (M)", "Final Position (D)");

        for (int N : stepOptions) {
            for (int trial = 1; trial <= trials; trial++) {
                int currentPosition = 0;

                for (int step = 0; step < N; step++) {
                    currentPosition += rand.nextBoolean() ? 1 : -1;
                }

                System.out.printf("%-20d %-20d %-20d%n", N, trial, currentPosition);
            }
        }
    }
}
