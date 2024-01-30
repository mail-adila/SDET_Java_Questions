/*
 * Program to reverse a string: Write a Java program to reverse a given string without using any built-in methods.
 */

import java.util.Scanner;

class StringReverse
{
    public static String find_reverse(String input)
    {
        String result = "";
        for(int j=input.length()-1; j>=0; j--)
        {
            result += input.charAt(j);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputString = sc.nextLine();
        sc.close();

        System.out.println(find_reverse(inputString));
    }
}
