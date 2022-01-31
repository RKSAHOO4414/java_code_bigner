import java.util.Scanner;

public class Array2D 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the row and cols....");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		
		System.out.println("rows :"+arr.length);
		System.out.println("cols :"+arr[0].length);
		
		input(arr);
		display(arr);
	}
	private static void display(int[][] arr) 
	{
		System.out.println("the matrix is:");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private static void input(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("enter the array element for row"+i);
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
}

//1. upper trangular
//2. lower trangualar
//3. add two matrix
//4. matrix multiplication
//5. Transpose
//6. sort row order