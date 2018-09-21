package exmaples;
import java.util.Scanner;

public class exstring
{
    private static Scanner read;

	public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
