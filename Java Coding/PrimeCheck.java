/*
 * Program to check if a number is prime:
 * Write a Java program to check if a given number is prime or not.
 */

import java.util.Scanner;

public class PrimeCheck 
{
    public static void primeCheck(int n)
    {
        boolean prime = true;
        if(n==1 || n==0)
        {
            System.out.println(n+" is neither prime nor composite");
        }
        else
        {
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if((n%i)==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                System.out.println(n+" is a prime number");
            }
            else
            {
                System.out.println(n+" is NOT a prime number");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        primeCheck(n);
    }
}
