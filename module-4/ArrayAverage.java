/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 4 - Overloaded Average Methods
 * Date: October 4, 2026
 *
 * Purpose:
 * This program demonstrates method overloading by creating
 * four average methods for short, int, long, and double arrays.
 * Each test array has a different size. The program displays
 * the original array elements and the calculated average.
 */

public class ArrayAverage {

    // Returns the average of a short array.
    public static short average(short[] array) {
        short sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (short)(sum / array.length);
    }

    // Returns the average of an int array.
    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Returns the average of a long array.
    public static long average(long[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Returns the average of a double array.
    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Each array has a different number of elements.
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 5.0, 7.5, 10.0, 12.5, 15.0};

        System.out.println("Array Average Test");
        System.out.println("------------------");

        System.out.print("Short array: ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(shortArray));

        System.out.println();

        System.out.print("Int array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(intArray));

        System.out.println();

        System.out.print("Long array: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(longArray));

        System.out.println();

        System.out.print("Double array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(doubleArray));
    }
}