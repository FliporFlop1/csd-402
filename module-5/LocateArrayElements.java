
/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 5 - Locating Array Elements
 * Date: October 11, 2026
 *
 * Purpose:
 * This program uses overloaded methods to locate the
 * largest and smallest elements in two-dimensional
 * double and int arrays.
 */

public class LocateArrayElements {

    // Find the largest element in a double array.
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int column = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > arrayParam[row][column]) {
                    row = i;
                    column = j;
                }
            }
        }

        return new int[]{row, column};
    }

    // Find the largest element in an int array.
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int column = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > arrayParam[row][column]) {
                    row = i;
                    column = j;
                }
            }
        }

        return new int[]{row, column};
    }

    // Find the smallest element in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int column = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < arrayParam[row][column]) {
                    row = i;
                    column = j;
                }
            }
        }

        return new int[]{row, column};
    }

    // Find the smallest element in an int array.
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int column = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < arrayParam[row][column]) {
                    row = i;
                    column = j;
                }
            }
        }

        return new int[]{row, column};
    }

    public static void main(String[] args) {

        double[][] doubleArray = {
            {4.5, 8.2, 1.3},
            {9.7, 2.4, 6.1},
            {3.8, 5.6, 7.9}
        };

        int[][] intArray = {
            {12, 45, 7, 23},
            {56, 3, 89, 14},
            {32, 67, 21, 5}
        };

        System.out.println("Module 5 - Array Element Locations");
        System.out.println("----------------------------------");

        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }

        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Largest: " +
            doubleArray[doubleLargest[0]][doubleLargest[1]] +
            " at row " + doubleLargest[0] +
            ", column " + doubleLargest[1]);

        System.out.println("Smallest: " +
            doubleArray[doubleSmallest[0]][doubleSmallest[1]] +
            " at row " + doubleSmallest[0] +
            ", column " + doubleSmallest[1]);

        System.out.println("\nInteger Array:");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);

        System.out.println("Largest: " +
            intArray[intLargest[0]][intLargest[1]] +
            " at row " + intLargest[0] +
            ", column " + intLargest[1]);

        System.out.println("Smallest: " +
            intArray[intSmallest[0]][intSmallest[1]] +
            " at row " + intSmallest[0] +
            ", column " + intSmallest[1]);
    }
}
