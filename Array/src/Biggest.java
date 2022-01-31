import java.util.Arrays;
import java.util.Scanner;

public class Biggest 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the size .........");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		input(arr);
		display(arr);
		
		System.out.println(Arrays.toString(arr));
		int brr[] = Arrays.copyOf(arr, 3);	//copyof() start from copy index
		int crr[] = Arrays.copyOfRange(arr, 2, 5);	//copyof() range() can start with any index
		
		System.out.println(Arrays.toString(brr));  //tostring() is used to display a string format
		System.out.println(Arrays.toString(crr));
		System.out.println(Arrays.equals(arr, brr)); //to check the equals or not
		
		//Arrays.fill(arr, 2, 5, 100);  //to fill the given position..
		System.out.println(Arrays.toString(arr));
		
		//Arrays.fill(arr, 500);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.hashCode(arr));  //to display the hash code ......
		
		findbig(arr);
	}
	private static void findbig(int[] arr) 
	{
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(large<arr[i])
				large=arr[i];
		}
		System.out.println("the biggest no. is:"+large);
	}
	private static void display(int[] arr) 
	{
		System.out.println("the array is :");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
	}
	private static void input(int[] arr) 
	{
		System.out.println("enter the array element :");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
	}
}
