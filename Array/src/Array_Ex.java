import java.util.Scanner;

public class Array_Ex 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the size.....");
		int size = sc.nextInt();
		int arr[] = new int[size];
		input(arr);
		display(arr);
	}
	private static void display(int[] arr) 
	{
		System.out.println("the array is :");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+ "\t");
		}
	}
	private static void input(int[] arr) 
	{
		System.out.println("enter the element .......");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
	}
}
