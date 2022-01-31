import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double cgpa;
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the size no student");
		int size = sc.nextInt();
		Student s[]=new Student[size];	//Array creation which will store hash code
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);	//null as object not ceated
			s[i] = new Student();	//object created and store hashcode
			System.out.println(s[i]);	//hashcode
			
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
			System.out.println("enter the data for student"+(i+1));
			s[i].roll = sc.nextInt();
			s[i].name=sc.next();
			s[i].cgpa=sc.nextDouble();
			
			System.out.println("------------------------------");
		}
		System.out.println("all the student details before sort .....");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		}
		Arrays.sort(s);
		
		System.out.println("all the student details after sort .......");
		for (int i = 0; i < s.length; i++) 
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);

	}
	@Override
	public int compareTo(Student s) {
		//return this.roll-s.roll;
		//return this.name.compaire(s.name);
		return Double.toString(this.cgpa).compareTo(Double.toString(s.cgpa));
	
	}
	
}
