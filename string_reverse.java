import java.util.Scanner;

public class string_reverse {

    public String find_reverse(String input)
    {
        String result = "";
        for(int j=input.length()-1; j>=0; j--)
        {
            result += input.charAt(j);
        }
        return result;
    }
    
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String inputString = sc.nextLine();
        sc.close();

        string_reverse reverse = new string_reverse();
        System.out.println(reverse.find_reverse(inputString));
    }
}
