import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class character_occurences
{
    String input;
    character_occurences(String inpuString)
    {
        this.input = inpuString;
    }

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

}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inpuString = sc.nextLine();
        sc.close();

        character_occurences char_functions = new character_occurences(inpuString);
        System.out.println("Character occuring the most number of times: "+ char_functions.most_frequent_char(inpuString)); 

    }

}



