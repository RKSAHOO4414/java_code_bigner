import java.io.*;
import java.util.*;

class Students
{
	String regdno;
	long mob;
	String name;
	String emails[];
}
public class StackEx1
{
	static DataInputStream dis=new DataInputStream(System.in);
	public static void main(String[] args) throws IOException 
	{
		Stack<Students> st=new Stack<Students>();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the details for new student ...");
			Students s= new Students();
			System.out.println("Enter the regdno");
			s.regdno=sc.next();
			System.out.println("Enter the mobile number");
			s.mob=sc.nextInt();
			System.out.println("Enter the name");
			s.name= sc.next();
			System.out.println("Enter no of emails u want to store ...");
			int size=sc.nextInt();
			s.emails= new String[size];
			for(int i=1; i<=s.emails.length; i++)
			{
				s.emails[i] = sc.next();
			}
			st.push(s);
			
			
			System.out.println("DO you want to continue , No for exit ...");
			char ch=(char) dis.read();
			if(ch=='N' || ch=='n')
				break;
			dis.readLine();
		}
		System.out.println("The content of stack ....");
		for (int i = 1; i < st.size(); i++) 
		{
			System.out.println(st.get(i).regdno);
			System.out.println(st.get(i).mob);
			System.out.println(st.get(i).name);
			System.out.println(Arrays.toString(st.get(i).emails));
		}
	}
}