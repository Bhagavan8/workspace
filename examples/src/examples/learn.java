package examples;
//import java.util.Collections;

/*public class learn {

    public static void main(String[] args) {

        int num = 12345698, reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num =num/10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}*/
/*public class learn {

    public static void main(String[] args) {

        double number= 12.3;
        double number1 =-12.3;

        // true if number is less than 0
        if (number1 < 0.0)
            System.out.println(number1 + " is a negative number.");

        // true if number is greater than 0
        else if ( number1 > 0.0)
            System.out.println(number1 + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number1 + " is 0.");
        System.out.println(number + "is positive number");
    }
}*/
//public class learn {

   /* public static void main(String[] args) {

        int year = 2014;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}*/
/*public class learn {

    public static void main(String[] args) {

        char c = 'c';
        char c1='a';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
    	
        	System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    
    if(c1>='a' && c<= 'z')
    	System.out.println(c1+  "is a char");
    else
    	System.out.println(c1+ " is not char");
    }
    	
}*/
/*public class learn {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}*/
/*import java.util.Scanner;

public class learn {

    private static Scanner reader;

	public static void main(String[] args) {

        reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}*/
/*public class learn {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}*/
/*public class learn {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}*/
/*public class learn {

    public static void main(String[] args) {

        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}*/
/*public class learn
{
	public static void main(String[] args) {
		
	int n = 5;
	//System.out.println("enter the rows" +row);
	
	for(int i=1;i<=n;i++)
	{
		System.out.println();
		for(int j=1;j<i;++j)
		{
	System.out.print("*");
		
		}
	}
		  
	}	// TODO Auto-generated method stub

	}*/
public class learn
{
	public static void main(String[] args) {
		
	int n = 5;
	//System.out.println("enter the rows" +row);
	
	for(int i=1;i<=n;i++)
	{
		System.out.println();
		for(int j=1;j<i;++j)
		{
	System.out.print(j);
		
		}
	}
	}
}
/*public class learn
{
	public static void main(String[] args) {
		
	int n = 5;
	//System.out.println("enter the rows" +row);
	
	for(int i=n;i>=1;--i)
	   {
		System.out.println();
		for(int j=1;j<=i;++j)
		 {
        	System.out.print("*");
		
		 }
	}
} 
}*/
/*public class learn
{
	public static void main(String[] args) {
		int n=6,flag=0;
		for(int i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
				System.out.println("print number is prime" +n);
		else
					System.out.println("print number is not prime"+n);
			}
		}*/

/*public class learn
{
	public static void main(String[] args) {
		
	int num=371,r,o,result=0;
	o=num;
	while(o!=0)
	{
		r=o%10;
		result+=Math.pow(r, 3);
		o/=10;
	}
	if(result==num)
		System.out.println("armstrong number is"+num);
	else
		System.out.print("not armstrong number"+num);
		
	}
}*/
/*public class learn
{
	public static void main(String[] args) {
	int n=5;
		if(n % 2==0)
	System.out.println("print even" +n);
		else
			System.out.println("invlaid" +n);
	}
	}
*/// Java program to demonstrate that we can sort
//array elements in a single line
/*import java.util.Arrays;

public class learn
{
	public static void main(String[] args)
	{
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// To sort a specific range of array in 
		// ascending order.
		//Arrays.sort(ar, 0, 4);
		//System.out.println("Sorted array in range" + 
			//" of 0-4 =>\n" + Arrays.toString(ar));

		// To sort the complete array in ascending order.
		Arrays.sort(ar);
		System.out.println("Completely sorted order =>\n"+ Arrays.toString(ar));

	}
}
*/
//Java program to demonstrate that we can do
//binary search on array elements in a single line
/*import java.util.Arrays;

public class learn
{
 public static void main(String[] args)
 {
     int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
      
     // Sort the complete array in ascending order
     // so that Binary Search can be applied
     Arrays.sort(ar);

     // To search for a particular value(for eg 9)
     // use binarysearch method of arrays
     int index = Arrays.binarySearch(ar,9);
     System.out.println("sorted array is" +Arrays.toString(ar));
     System.out.println("Position of 9 in sorted"+
                      " arrays is => \n" + index);

 }
}*/
/*import java.util.Arrays;

public class learn
{
    public static void main(String[] args)
    {
        int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // Copy the whole array
        Arrays.sort(ar);
        System.out.println("sorted array" +Arrays.toString(ar));
       // int[] copy = Arrays.copyOf(ar, ar.length);
        //System.out.println("Copied array => \n" + 
                           //Arrays.toString(copy));
 
        // Copy a specified range into a new array.
        int[] rcopy = Arrays.copyOfRange(ar, 5, 5);
        System.out.println("Copied subarray => \n" + 
                           Arrays.toString(rcopy));
    }
}*/
//Java program to fill a subarray or complete
//array with given value.
/*import java.util.Arrays;

public class learn
{
 public static void main(String[] args)
 {
     int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

     // To fill a range with a particular value
     Arrays.fill(ar, 0, 2, 0);
     System.out.println("Array filled with 0 "+
       "from 0 to 3 => \n" + Arrays.toString(ar));

     // To fill complete array with a particular
     // value
     Arrays.fill(ar, 10);
     System.out.println("Array completely filled"+
               " with 10=>\n"+Arrays.toString(ar));
 }
}*/
//Java program to demonstrate asList()
/*import java.util.Arrays;
import java.util.List;

public class learn
{
 public static void main(String[] args)
 {
     Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

     // Creates a wrapper list over ar[]
     List<Integer> l1 = Arrays.asList(ar);

     System.out.println(l1);
 }
}
*/
/*public class learn
{
	public static void main(String[] args) {
		int a=10;
		int b=50;
		int[] array=new int[]{((b-a/2))};
		int index=0;
		for(int i=a;i<=b;i++)
		{
		if(i%2!=0)
		array[index++]=i;
	}

for(int i=0;i<array.length;i++)
	System.out.println(array[i]);

		
	}
}*/
/*public class learn {
	public static void main(String args[]) {
		System.out.println("The Odd Numbers are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}*/
/*import java.util.Scanner;

public class learn

{

    public static void main(String[] args) 

    {

        int n, sum = 0;

 
     Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

            sum = sum + a[i];

        }

        System.out.println("Sum:"+sum);

    }

}*/
/*import java.util.Arrays;
 
public class learn{
public static void main(String[] args)
    {
 
        // Initializing array of integers
        Integer[] num = { 2, 4, 7, 5, 9 };
 
        // using Collection.min() to find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));
 
        // using Collection.min() to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));
 
        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : " + max);
    }
}*/
/*import java.util.Scanner;
public class learn{
	 private static Scanner scr;
	public static void main(String[] args) {
	 scr = new Scanner(System.in);
	    //scr.test();
	 	System.out.println("enter the string");
	 	String str=scr.next();
	 	System.out.println("str=" +str);
	 }
	 public void test(){

	 	
	 	
	}
}*/

