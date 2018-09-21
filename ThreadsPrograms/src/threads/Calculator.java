package threads;
import java.util.Random;

public class Calculator {
	@SuppressWarnings("unused")
	public static int[] generatorArray(int size){
		int[] array =new int[size];
		for(int i=0;i<array.length;i++){
			array[i] =new Random().nextInt();
			return array;
		}
		return array;
		
	}

}
