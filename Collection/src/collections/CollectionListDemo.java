package collections;

import java.util.ArrayList;

public class CollectionListDemo {
	public static void main(String[] args) {
		//@SuppressWarnings("rawtypes")
		ArrayList<String> mylist =new ArrayList<String>();
		mylist.add("bhagavan");
		mylist.add("agavan");
		//mylist.add(1000);
		//mylist.add(true);
	/*	System.out.println(mylist.get(2));
		for(int i=0;i<mylist.size();i++)
			System.out.println(mylist.get(i));
		*/for(String s:mylist){
			System.out.println(s);
		}
		
		
		
	}

}
