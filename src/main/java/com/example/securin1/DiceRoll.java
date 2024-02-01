package com.example.securin1;

public class DiceRoll {

    public static void main(String[] args) {
        // Problem 1
        int totalCombinations = 6 * 6;  // Since each die has 6 faces
        System.out.println("Total Combinations: " + totalCombinations);

        // Problem 2
        int[][] distributionMatrix = new int[6][6];

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                distributionMatrix[i - 1][j - 1] = i + j;
            }
        }

        System.out.println("Distribution Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(distributionMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Problem 3
        double[] probabilities = new double[12];

        for (int i = 2; i <= 12; i++) {
            int count = 0;
            for (int[] row : distributionMatrix) {
                for (int value : row) {
                    if (value == i) {
                        count++;
                    }
                }
            }
            double probability = (double) count / totalCombinations;
            probabilities[i - 2] = probability;
        }

        System.out.println("Probabilities:");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("P(Sum = %d) = %.4f\n", i, probabilities[i - 2]);
        }
    }
}
