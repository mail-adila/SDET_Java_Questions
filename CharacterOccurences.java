/*
 * Question : This has 4 parts
 * 1. Instantiate the class passing a string
 * 2. Method to return the most requent character
 * 3. Method to return the leasr frequent character
 * 4. Method to return the characters in drcreasing order of its frequencies
 * If more than one character has same frequency, return the first.
 * 
 * Approach:
 *  1. Have a hashmap that keeps the characters as the key and the frequency as the value
 *  2. Create a method to take in the input, 
 *      2.1. Get the frequency hashmap
 *      2.2. For each entry set in the map,
 *              2.2.1 compare the values and get the maximum value
 *              2.2.2 save this value and its key
 *      2.3. Return this value
 *  3. Create a method to take in the input, 
 *      3.1. Get the frequency hashmap
 *      3.2. For each entry set in the map,
 *              3.2.1 compare the values and get the minimum value
 *              3.2.2 save this value and its key
 *      3.3. Return this value
 *  4. Create a method to take in the input, 
 *      4.1. copy input string to another string
 *      4.2 update this copy everytime we find the most frequent character
 *      4.3 in a loop, find the most frequent character
 *      4.4 remove this character from the copy
 *      4.5 find the next most frequent character
 *      4.6 append each result into a string
 *      4.7 return the result string
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurences
{
    String input;
    CharacterOccurences(String inpuString)
    {
        this.input = inpuString;
    }

    // function to return the character count map of any string that is passed to it
    public HashMap<Character, Integer> get_character_count(String input)
    {
        HashMap<Character, Integer> char_count = new HashMap<>();
        char[] input_char_array = new char[input.length()];
        input_char_array = input.toCharArray();

        for(char c:input_char_array)
        {
            if(char_count.keySet().contains(c))
            {
                char_count.put(c, char_count.get(c)+1);
            }
            else
            {
                char_count.put(c, 1);
            }
        }
        return char_count;
    }

    // function takes in input string, returns the character most occuring
    public char most_frequent_char(String input)
    {
        HashMap<Character, Integer> frequency = new HashMap<>();
        frequency = get_character_count(input);
        int max = 0;
        char max_char = '\0';
        for(Map.Entry<Character, Integer> freq_entry: frequency.entrySet())
        {
            char current_char = freq_entry.getKey();
            int current_count = freq_entry.getValue();
            if(current_count>max)
            {
                max = current_count;
                max_char = current_char;
            }
        }
        return max_char;
    }

    // function takes in input string, returns the character most occuring
    public char least_frequent_char(String input)
    {
        HashMap<Character, Integer> frequency = new HashMap<>();
        frequency = get_character_count(input);
        int least = input.length();
        char least_char = '\0';
        for(Map.Entry<Character, Integer> freq_entry: frequency.entrySet())
        {
            char current_char = freq_entry.getKey();
            int current_count = freq_entry.getValue();
            if(current_count<least)
            {
                least = current_count;
                least_char = current_char;
            }
        }
        return least_char;
    }

    //function to return the string in the increasing order of character count
    public String character_sort(String input)
    {
        StringBuilder result = new StringBuilder();
        char most_frequent = '\0';
        String updated_input = input;

        while(updated_input.length()>0)
        {
            most_frequent = most_frequent_char(updated_input);
            updated_input = updated_input.replace(Character.toString(most_frequent), "");
            result.append(most_frequent);
        }
        return result.toString();
    }

}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inpuString = sc.nextLine();
        sc.close();

        // instantiating the class using parameters - input string passed to the class, constructor sets it
        CharacterOccurences char_functions = new CharacterOccurences(inpuString);
        // call function to return the character occuring the most number of times
        System.out.println("Character occuring the most number of times: "+ char_functions.most_frequent_char(inpuString)); 
        // call function to return the charcter occuring the least number of times
        System.out.println("Character occuring the least number of times: "+ char_functions.least_frequent_char(inpuString)); 
        // call function to return the charcters in order of frequency
        System.out.println("Characters in order of frequency: "+ char_functions.character_sort(inpuString)); 

    }
}



