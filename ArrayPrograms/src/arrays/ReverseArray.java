package arrays;
public class ReverseArray {
	static void Reverse(int[] array,int start,int end){
		while(end>start){
			int temp;
			temp =array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
			
		}
	}
	static void displayArray(int array[],int size){
			for(int i=0;i<size;i++){
				System.out.print(array[i]);
			}System.out.println(" ");
		}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
        displayArray(arr, 6);
        Reverse(arr, 0, 5);
        System.out.print("Reversed array is");
        displayArray(arr, 6); 
	}
}