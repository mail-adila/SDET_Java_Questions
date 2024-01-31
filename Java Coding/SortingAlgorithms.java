/*
 * Program to sort an array of integers:
 * Write a Java program to sort an array of integers using any sorting algorithm 
 * (bubble sort, selection sort, insertion sort).
 */

import java.util.Scanner;

public class SortingAlgorithms 
{
    /*
     * In Bubble Sort algorithm, 
     *  1. traverse from left and compare adjacent elements and the higher one is placed at right side. 
     *  2. In this way, the largest element is moved to the rightmost end at first. 
     *  3. This process is then continued to find the second largest and place it and so on until the data is sorted.
     */
    public static void bubbleSort(int[] inputArray)
    {
        int[] bubble_sorted = new int[inputArray.length];
        bubble_sorted = inputArray;
        int temp;
        for(int q=0; q<bubble_sorted.length; q++)
        {
            for(int w=q+1; w<bubble_sorted.length; w++)
            {
                if(bubble_sorted[q]>bubble_sorted[w])
                {
                    temp = bubble_sorted[q];
                    bubble_sorted[q] = bubble_sorted[w];
                    bubble_sorted[w] = temp;
                }
            }
        }
        System.out.println("The bubble sorted array is:");
        printArray(bubble_sorted);
    }

    /*
     * Selection sort is a simple and efficient sorting algorithm that works by repeatedly 
     * selecting the smallest (or largest) element from the unsorted portion of the list and 
     * moving it to the sorted portion of the list. 
     */
    public static void selectionSort(int[] inputArray)
    {
        int[] selection_sorted = new int[inputArray.length];
        selection_sorted = inputArray;
        int temp;
        int min;
        for(int q=0; q<selection_sorted.length; q++)
        {
            min = selection_sorted[q];
            for(int w=q+1; w<selection_sorted.length; w++)
            {
                if(selection_sorted[w]<min)
                {
                    min = selection_sorted[w];
                }
            }
            temp = selection_sorted[q];
            selection_sorted[q] = min;
            min = temp;
        }
        System.out.println("The selection sorted array is:");
        printArray(selection_sorted);
    }

    /*
     * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing 
     * cards in your hands. The array is virtually split into a sorted and an unsorted part. 
     * Values from the unsorted part are picked and placed at the correct position in the sorted part.
     */
    public static void insertionSort(int[] inputArray)
    {
        int[] insertion_sorted = new int[inputArray.length];
        insertion_sorted = inputArray;

        int temp = 0;
        for(int i=0; i<insertion_sorted.length; i++)
        {
            for(int j=i+1; j<insertion_sorted.length; j++)
            {
                if(insertion_sorted[i]>insertion_sorted[j])
                {
                    temp = insertion_sorted[i];
                    insertion_sorted[i] = insertion_sorted[j];
                    insertion_sorted[j] = temp;
                }
            }
        }
        System.out.println("The insertion sorted array is:");
        printArray(insertion_sorted);
    }

    public static void printArray(int[] inputArray)
    {
        //System.out.println("");
        for(int i=0; i<inputArray.length;i++)
        {
            System.out.print(inputArray[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] inputArray = new int[n];
        System.out.println("Enter the "+ n + " array elements: ");
        for(int i=0; i<n; i++)
        {
            inputArray[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort(inputArray);
        selectionSort(inputArray);
        insertionSort(inputArray);
    }
}
