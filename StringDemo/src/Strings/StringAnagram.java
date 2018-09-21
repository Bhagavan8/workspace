package Strings;
import java.util.Arrays;
public class StringAnagram {
	    static void isAnagram(String s1, String s2)
	    {
	 
	        String str1= s1.replaceAll("\\s", "");
	 
	        String str = s2.replaceAll("\\s", "");
	 
	        boolean status = true;
	 
	        if(str1.length() != str.length())
	        {
	 
	            status = false;
	        }
	        else
	        {
	        	char[] s1Array = str1.toLowerCase().toCharArray();
	 
	            char[] s2Array = str.toLowerCase().toCharArray();
	            	
	            Arrays.sort(s1Array);
	            System.out.println(s1Array);
	            Arrays.sort(s2Array);
	            //System.out.println(s2Array);
	          status = Arrays.equals(s1Array, s2Array);
	          System.out.println(status);
	        }
	         if(status)
	        {
	            System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        isAnagram("Bhagavan", "navagahb");
	    }
}
