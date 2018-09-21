package threads;

public class BubbleSort {
public static int[] bubbleSort(int[] array){
	int temp;
	for(int i=0;i<array.length-1;i++){
		for(int j=0;j<array.length-i;j++){
			if(array[j-1]>array[j]){
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				
	
			}
		}
	}
return array;
	}
}
