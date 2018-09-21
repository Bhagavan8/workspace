package projecta;

import java.util.Scanner;

public class Scannertest {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("enter the value");
		//int a=s.nextInt();
		char c= s.next().charAt(0);
		System.out.println("enter the value=" +c);
	}

}
