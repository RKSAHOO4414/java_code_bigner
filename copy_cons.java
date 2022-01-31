class Student
{
	int roll;
	String name;

	Student(Student s)
	{
		roll = s.roll;
		name = s.name;
	}
	Student()
	{

	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println("state of s1:"+s1.roll+"\t"+s1.name);
		System.out.println(s1);

		Student s2=new Student();
		s1.roll = 100;
		s1.name = DJ;
		System.out.println("state of s1:"+s1.roll+"\t"+s1.name);
		s2.roll=101;
		s2.name=babu;
		System.out.println("state of s2:"+s2.roll+"\t"+s2.name);

		Student s3 = new Student();
		System.out.println("state of s3:"+s3.roll+"\t"+s3.name);
	}
}