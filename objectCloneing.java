class Student implements Cloneble
{
	int roll;
	String name;
	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1.roll+"\t"+s1.name);
		s1.roll=100;
		s1.name="raja";
		System.out.println("state of s1:"+s1.roll+"\t"+s1.name);
		Student s2=(Student)s1.Clone();
		System.out.println("state of s2:"+s2.roll+"\t"+s2.name);
	}
}