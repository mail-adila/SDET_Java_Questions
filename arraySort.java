/*
 * Question : Sort the array of any size without using sort function
 * Approach:
 *  1. Set an achor element
 *  2. Compare this element with the rest of the array
 *  3. If we find any element smaller than this number, 
 *  4. We swap it for the smaller number we found
 */

import java.util.Scanner;

class Main
{
    public static void sortInputArray(int[] input)
    {
        int temp = 0;
        for(int i=0; i<input.length; i++)
        {
            for(int j=i+1; j<input.length; j++)
            {
                if(input[i]>input[j])
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int k=0; k<input.length; k++)
        {
            System.out.print(input[k]+" ");
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
        sc.close();

        sortInputArray(inputArray);
    }
}