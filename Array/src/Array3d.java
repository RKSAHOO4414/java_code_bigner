
public class Array3d 
{
	public static void main(String[] args) 
	{
		char arr[][][] = new char[2][3][2];
		int ch=65;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				for (int k = 0; k < arr[i][j].length; k++) 
				{
					arr[i][j][k] = (char) ch++;
					System.out.print(arr[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
