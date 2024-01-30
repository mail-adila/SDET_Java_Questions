/*
 * Program to find the factorial of a number without recursion: Write a Java program to calculate 
 * the factorial of a given number without using recursion.
 */

import java.util.Scanner;

public class Factorial {

    public static int find_factorial(int n)
    {
        int factorial = 1;
        if((n==0) || (n==1))
        {
            factorial = 1;
        }
        for(int i=2; i<n+1; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find it's factorial: ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println("Factorial is: " + find_factorial(n));
    }
}
