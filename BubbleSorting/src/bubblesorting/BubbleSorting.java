/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesorting;

import java.util.Arrays;

/**
 *
 * @author ST10437711
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5, 55};

        // This will show the original array before sorting.
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array in descending order
        bubbleSortDescending(arr);
        // Show sorted array in descending order
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));

        // Sort the array in ascending order
        bubbleSortAscending(arr);
        // Show sorted array in ascending order
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }

    // Bubble sort in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop then break.
            if (!swapped) {
                break;
            }
        }
    }

    // Bubble sort in ascending order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Change from > to < to perform ascending sort
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop then break.
            if (!swapped) {
                break;
            }
        }
    }
}