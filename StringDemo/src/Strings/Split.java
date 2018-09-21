package Strings;

public class Split {
	static void stringSplit(String name){
		String[] array=name.split(" ");
		for(String s:array){
			System.out.println(s);
		}
	}
public static void main(String[] args) {
	Split.stringSplit("Bhagavan is very bad guy".toUpperCase());
}
}