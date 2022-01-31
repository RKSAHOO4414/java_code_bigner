import java.util.*;
class Emp
{
	String name;
	double salary;
	long phone[];
	public Emp(String name, double salary, long[] phone) 
	{
		//super();
		this.name = name;
		this.salary = salary;
		this.phone = phone;
	}
	
}
public class vectorHashTableEx 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Hashtable<Integer, Emp> table=new Hashtable<Integer, Emp>();
		System.out.println("Enter the id");
		long ph[]=new long[] {1111111L,222222L,555555L};
		table.put(sc.nextInt(), new Emp("Raja",5000,ph));
		System.out.println("Enter the id");
		ph= new long[] {121212L, 123223L, 12345432L};
		table.put(sc.nextInt(), new Emp("rani",4000,ph));
		
		System.out.println("Enter the id");
		ph=new long[] {66666666L, 88888888L, 33333333L};
		table.put(sc.nextInt(), new Emp("Ajay", 9000, ph));
		
		System.out.println();
		System.out.println(table.keySet());
		System.out.println(table.values());
		Set<Integer> keys=table.keySet();
		System.out.println("All the employee details");
		for(Object key : keys)
		{
			Emp e=table.get(key);
			System.out.println("Id   :"+key);
			System.out.println("name :"+e.name);
			System.out.println("salary : "+e.salary);
			System.out.println("phone number :");
			long p[]=e.phone;
			for(long m:p)
				System.out.println(m +"\t");
			System.out.println("\n-------------------------\n");
		}
	}
}
