/*
 * Program to implement binary search:
 * Write a Java program to implement binary search on a sorted array of integers.
 */

import java.util.Scanner;

public class BinarySearch 
{
    public static void binarySearch(int[] inputArray, int search)
    {
        int left = 0;
        int right = inputArray.length-1;
        //int mid = left + right/2;
        boolean found = false;

        while(left<right)
        {
            int mid = left + right/2;
            System.out.println("left: "+left+"   right: " + right+ "    mid: "+mid+"   search: "+search+"    midelement: "+inputArray[mid]);

            if(search<inputArray[mid])
            {
                right = mid;
            }
            else if (search==inputArray[mid]) 
            {
                System.out.println(search+ " was found at "+ mid + " position in the array");  
                found = true;
                break; 
            }
            else
            {
                left = mid;
            }
            //mid = (left + right)/2;
        }
        if(!found)
        {
            System.out.println("Search element "+search+ " was NOT found in the input array!");
        }
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

        System.out.println("Enter the element to search for in the array: ");
        int search = sc.nextInt();
        sc.close();

        binarySearch(inputArray, search);

    }    
}
