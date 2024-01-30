/*
 * Program to find the largest and smallest elements in an array:
 * Write a Java program to find the largest and smallest elements in an array of integers.
 */

import java.util.Scanner;

public class LargestSmallestArray
{
    public static void findLargestAndSmallest(int[] inputArray)
    {
        int min = inputArray[0];
        int max = 0;
        int temp;

        for(int i=0; i<inputArray.length; i++)
        {
            if(inputArray[i]>max)
            {
                temp = inputArray[i];
                inputArray[i] = max;
                max = temp;
            }
            else if(inputArray[i]<min)
            {
                temp = inputArray[i];
                inputArray[i] = min;
                min = temp;
            }
        }
        System.out.println("Largest in the input array is: "+max);
        System.out.println("Smallest in the input array is: "+min);
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

        findLargestAndSmallest(inputArray);
    }
}
