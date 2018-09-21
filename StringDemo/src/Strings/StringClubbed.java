package Strings;

public class StringClubbed {
	static void stringClub(String name){
		String[] array=name.split(" ");
		for(String s:array){
			System.out.print(s.charAt(0));
		}
	}
public static void main(String[] args) {
	StringClubbed.stringClub("Bhagavan is very bad guy".toUpperCase());
}
}
