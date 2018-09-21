package slips;

import java.util.regex.*;

public class Matcher {
	public static void main(String[] args) {
		
	
	String s = "I want to walk my dog, and why not?";
	Pattern pattern = Pattern.compile("\\w+");
	java.util.regex.Matcher matcher = pattern.matcher(s);
	while (matcher.find()) {
	    System.out.println(matcher.group());
	}
	}
}