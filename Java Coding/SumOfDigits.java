/*
 * Program to calculate the sum of digits of a number:
 * Write a Java program to calculate the sum of digits of a given number.
 */

import java.util.Scanner;

public class SumOfDigits {

    public static int findSumOfDigits(int n)
    {
        int sum=0;
        int num =n;
        int rem;
        while(num>0)
        {
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The sum of the digits of the entered number "+ n + " is : "+findSumOfDigits(n));
    }
}
