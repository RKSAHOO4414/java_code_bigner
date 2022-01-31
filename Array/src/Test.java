//use of comparator

import java.util.Arrays;
import java.util.Scanner;
class CompareRoll1 implements java.util.Comparator<Test>
{
	public int compare(Test s1,Test s2)
	{
		return s1.roll-s2.roll;
	}
}
class CompareName1 implements java.util.Comparator<Test>
{
	public int compare(Test s1, Test s2)
	{
		return s1.name.compareTo(s2.name);
	}
}
class CompareCgpa1 implements java.util.Comparator<Test>
{
	public int compare(Test s1, Test s2)
	{
		return Double.toString(s1.cgpa).compareTo(Double.toString(s2.cgpa));
	}
}

public class Test 
{
	int roll;
	String name;
	Double cgpa;
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter the size no. of student");
		int size= sc.nextInt();
		Test s[]=new Test[size];
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			s[i]=new Test();
			System.out.println(s[i]);
			
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
			System.out.println("enter the data for student" +(i+1));
			
			s[i].roll=sc.nextInt();
			s[i].name=sc.next();
			s[i].cgpa=sc.nextDouble();
			
			System.out.println("--------------------------------------");
		}
		System.out.println("all the student details before sort ....");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		}
		Arrays.sort(s,new CompareRoll1());
		System.out.println("all the student details after sort");
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		Arrays.sort(s,new CompareName1());
		System.out.println("all the student details after sort");
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		
		Arrays.sort(s,new CompareCgpa1());
		 		System.out.println("all the student details after sort by cgpa");
		 		for (int i = 0; i < s.length; i++)
		 			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		
	}
}