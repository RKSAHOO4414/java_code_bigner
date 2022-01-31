import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex1 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the size.....");
		int size = sc.nextInt();
		int arr[] = new int[size];
		input(arr);
		display(arr);
		
		//how to sort
		Arrays.sort(arr);  	//full array sort 
		//Arrays.sort(arr);  	//part of the array to be sorted
		display(arr);
		System.out.println(Arrays.toString(arr));
		//searching
		System.out.println("enter the element to be searched");
		int index = Arrays.binarySearch(arr, sc.nextInt());
		if(index>=0)
			System.out.println("found at index :" +index);
		else
			System.out.println("not found");
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
