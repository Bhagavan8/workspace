package matrix;

public class two {

	public static void main(String[] args) {
		int[][]two=new int[4][3];
		int temp=10;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				two[i][j]=temp;
				temp+=10;
			}
			
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(two[i][j]+ "");
			}
			System.out.println();
		}
		
	}
}
