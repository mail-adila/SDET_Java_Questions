/*
 * Program to calculate the sum of digits of a alphanumberic string:
 * Write a Java program to calculate the sum of digits of a alphanumeric string - values of alphabet are a=1, b=2,....z=26.
 */

import java.util.Scanner;

public class SumOfAlphanumericString 
{
    public static int sumOfAlphanumericString(String input)
    {
        input = input.toLowerCase();
        int sum=0;
        for(int i=0; i<input.length(); i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                sum = sum + ((input.charAt(i)-'0'));
            }
            if(Character.isAlphabetic(input.charAt(i)))
            {
                sum = sum + ((int)input.charAt(i) - (int)'a' + 1);
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphanumeric input string: ");
        String inpuString = sc.nextLine();
        sc.close();

        System.out.println("Sum of the string is: "+sumOfAlphanumericString(inpuString));
    }
}
