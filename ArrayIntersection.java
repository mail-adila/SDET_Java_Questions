/*
 * Program to find the intersection of two arrays:
 * Write a Java program to find the intersection of two arrays and return a new array containing only the common elements.
 * Assume no duplictes in input arrays
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayIntersection {

    public static List<Integer> intersection(int[] a, int[] b)
    {   
        ArrayList<Integer> result = new ArrayList<>();
    
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    result.add(a[i]); // Store the intersection element
                    break; // Once an intersection is found, move to the next element in 'a'
                }
            }
        }    
        return result;
    }

    public static void printList(List<Integer> list) {
        if(list.size()==0)
        {
            System.out.println("No common elements found in the two input arrays: ");
        }
        else
        {
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();

        int[] inputArray_1 = new int[n];
        System.out.println("Enter the "+ n + " array elements: ");
        for(int i=0; i<n; i++)
        {
            inputArray_1[i] = sc.nextInt();
        }

        int[] inputArray_2 = new int[m];
        System.out.println("Enter the "+ m + " array elements: ");
        for(int i=0; i<m; i++)
        {
            inputArray_2[i] = sc.nextInt();
        }

        System.out.println("Array intersection of these: "); 
        printList(intersection(inputArray_1, inputArray_2));

        sc.close();
    }
    
}
