package Strings;

import java.io.EOFException;

public class StringRemove {
public static void main(String[] args) throws EOFException{
		      String str = "computer science and engineering";
		      System.out.println(removeCharAt(str, 3));
		      System.out.println(indexOf(str, 5));
		   }
		   private static String indexOf(String str, int i) {
	// TODO Auto-generated method stub
			  
			   return str.substring(0, i) + str.substring(1 + 1);
}
		public static String removeCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   
		   }
}
