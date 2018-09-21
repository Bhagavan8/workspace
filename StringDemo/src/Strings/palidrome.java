package Strings;
//import java.util.*;
import java.util.Scanner;
public class palidrome {  
       private static Scanner s;

	public static void main(String args[]){  
          String original, reverse = ""; 
          s = new Scanner(System.in);   
          System.out.println("Enter a string");  
          original = s.nextLine();   
          int length = original.length();   
          for ( int i = length - 1; i >= 0; i-- )  
             reverse = reverse + original.charAt(i);  
          if (original.equals(reverse))  
             System.out.println("Entered string is palindrome");  
          else  
             System.out.println("Entered string is not palindrome.");   
       }  
    }  

