import java.io.*;
import java.util.*;

class Students1
{
	String regdno;
	long mob;
	String name;
	String emails[];
}
public class QueueEx
{
	static DataInputStream dis=new DataInputStream(System.in);
	public static void main(String[] args) throws IOException 
	{
		Queue<Students1> q=new LinkedList<Students1>();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the details for new student ...");
			Students1 s= new Students1();
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
			q.add(s);
			
			
			System.out.println("DO you want to continue , No for exit ...");
			char ch=(char) dis.read();
			if(ch=='N' || ch=='n')
				break;
			dis.readLine();
		}
		System.out.println("The content of stack ....");
		for (Students1 ob : q) 
		{
			System.out.println(ob.regdno);
			System.out.println(ob.name);
			System.out.println(ob.mob);
			System.out.println(Arrays.toString(ob.emails));
		}
	}
}