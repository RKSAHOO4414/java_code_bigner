import java.util.Scanner;

public class CountChar 
{
	static void count(String str)
	{
		int[] n = new int[26];
		
		//store the character frequency in array
		for (int i = 0; i < n.length; i++) 
		{
			n[str.charAt(i) - 'a']++;
		}
		//Traverse the array
		for (int i = 0; i < n.length; i++) 
		{
			if (n[i]!=0) 
			{
				System.out.println((char)(i+'a')+"-->");
				System.out.println(n[i]+"\t");
			}
		}
	}
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str = sc.nextLine();
		count(str);
		System.out.println();
	}
}
