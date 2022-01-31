//how to override tostring() methode of object class
class Test
{
	String msg;
	public String toString()
	{
		return msg;
	}
	Test(String msg)
	{
		this.msg=msg;
	}
	public static void main(String[] args) 
	{
		Test t1=new Test("java is simple ....");
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println("-------------------------");
		String s1=new String("hello");
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}