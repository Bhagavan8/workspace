package Strings;

public class StringBuffers {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("bhagavan  c v");
		str.append("cv");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		str.insert(2, "good");
		System.out.println(str);
		str.delete(1, 9);
		System.out.println(str);
		str.replace(1, 4, "bhagavan");
		System.out.println(str);
		
		
	}

}
