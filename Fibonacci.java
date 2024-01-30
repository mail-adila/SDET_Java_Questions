/*
 * Program to find the Fibonacci series:
 * Write a Java program to generate the Fibonacci series up to a specified limit.
 */

import java.util.Scanner;

public class Fibonacci 
{   
    public static void getFibonacci(int n)
    {
        int a, b;
        System.out.println("The fibonacci series upto "+n+" is: ");
        if(n == 1)
        {
            System.out.println("0");
        }
        else
        {
            a = 0;
            b = 1;
            if(n==2)
            {
                System.out.println(a+" "+b);
            }
            else
            {
                System.out.print(a+" "+b+" ");
                int c = a+b;
                while(c<n)
                {
                    c = a+b;
                    System.out.print(c+" ");
                    a =b;
                    b = c;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();

        getFibonacci(n);
    }
}
