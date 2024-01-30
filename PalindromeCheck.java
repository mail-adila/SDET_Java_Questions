/*
 * Program to check if a string is a palindrome:
 *  Write a Java program to determine if a given string is a palindrome or not. 
*/

import java.util.Scanner;

public class PalindromeCheck {

    public static void palindromeCheck(String input)
    {
        String reverse = "";
        for(int i=input.length()-1; i>=0; i--)
        {
            reverse += input.charAt(i);
        }
        if(reverse.equals(input))
        {
            System.out.println("The input string is a palindrome!");
        }
        else
        {
            System.out.println("The input string is NOT palindrome!");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = sc.nextLine();
        sc.close();

        palindromeCheck(input);
    }
    
}
