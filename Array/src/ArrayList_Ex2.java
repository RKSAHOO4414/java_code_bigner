import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee1
{
	int id;
	String name;
	double salary;
	public Employee1(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() 
	{
		return id+"\t"+name+"\t"+salary+"\n"; 
	}
}

class Abc 
{
	public static void main(String[] args) throws java.io.IOException
	{
		ArrayList<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1(100,"Mukesh",6000));
		list.add(new Employee1(200,"Sameer",7000));
		list.add(new Employee1(400,"soumya",5000));
		list.add(new Employee1(300,"surya",4000));
		System.out.println("All The Details BEfore sort");
		System.out.println(list);
		Collections.sort(list,new CompareId());
		System.out.println("Sort By id wise");
		System.out.println(list);

		Collections.sort(list,new Comparename());
		System.out.println("Sort By name wise");
		System.out.println(list);
		
		Collections.sort(list,new CompareSalary());
		System.out.println("Sort By salary wise");
		System.out.println(list);
	}
}
class CompareId implements Comparator<Employee1>
{
	public int compare(Employee1 emp1,Employee1 emp2)
	{
		return emp1.id-emp2.id;
	}
}
class Comparename implements Comparator<Employee1>
{
	public int compare(Employee1 emp1,Employee1 emp2)
	{
		return emp1.name.compareTo(emp2.name);
	}
}
class CompareSalary implements Comparator<Employee1>
{
	public int compare(Employee1 emp1,Employee1 emp2)
	{
		return Double.toString(emp1.salary).compareTo(Double.toString(emp2.salary));
	}
}
