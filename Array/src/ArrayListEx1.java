import java.util.ArrayList;


class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+salary+"\n";
	}
}
public class ArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> list = new  ArrayList<Employee>();
		System.out.println(list);
		list.add(new Employee(100,"Raja",5000));
		list.add(0,new Employee(10,"Ajay",6000));
		list.add(2,new Employee(102,"Rani",9000));
		list.add(new Employee(105,"bijay",3400));
		System.out.println(list);
	}
}