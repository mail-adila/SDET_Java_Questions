/*
 * Program to find the Fibonacci series:
 * Write a Java program to generate the Fibonacci series up to a specified limit.
 */

import java.util.Scanner;

public class Fibonacci 
{   
    public static int getFibonacciRecursion(int n) 
    {
        if (n <= 1) 
        {
            return n;
        } 
        else 
        {
            return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
        }
    }

    public static void getFibonacci(int n)
    {
        int a, b;
        System.out.println("The fibonacci series upto "+n+" (without recursion) is: ");
        if(n == 1)
        {
            System.out.println("0");
        }
        else
        {
            a = 0;
            b = 1;
            System.out.print(a+" "+b+" ");
            if(n>=2)
            {
                //System.out.print(a+" "+b+" ");
                int c = a+b;
                while(c<n)
                {
                    System.out.print(c+" ");
                    a =b;
                    b = c;
                    c = a+b;
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();

        getFibonacci(n);
        System.out.println("The fibonacci series upto "+n+" (using recursion) is: ");
        for (int i = 0; getFibonacciRecursion(i) < n; i++) 
        {
            System.out.print(getFibonacciRecursion(i) + " ");
        }
    }
}
