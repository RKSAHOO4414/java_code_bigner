import java.util.*;

class Empl
{
	int id;
	double salary;
	LinkedList<Long> mob;
	String name;
	public String toString()
	{
		return id+"\t"+name+"\t"+salary+"\t"+mob;
	}
}
public class vectorEx1 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		Vector<Empl> v= new Vector<Empl>();
		String choice = "yes";
		while(true)
		{
			if (choice.equalsIgnoreCase("yes")) 
			{
				System.out.println("logic to add node to vector");
				Empl e= new Empl();
				System.out.println("Enter values for a new objects");
				e.id=sc.nextInt();
				e.name=sc.next();
				e.salary=sc.nextDouble();
				e.mob= new LinkedList<Long>();
				v.add(e);
				while (true) 
				{
					System.out.println("enter a new mobile number");
					e.mob.add(sc.nextLong());
					System.out.println("enter 0 to exit ....");
					int ch=sc.nextInt();
					if (ch==0) 
						break;
					System.out.println("Enter your choice(yes/no) ...");
					choice =sc.next();
				}
			}
			else if(choice.equalsIgnoreCase("no"))
			{
				System.out.println("Exited ...");
				break;
			}
			else
			{
				System.out.println();
			}
		}
		System.out.println("list of employee .....");
		System.out.println(v);
	}
}
