class Test
{
	int x=10;
	private static int count=0;
	static Test obj=null;

	private Test()
	{
		System.out.println("private constructor ....");
	}
	public static Test getObject()	
	{
		if (count<1) 
		{
			obj = new Test();
			count++;
		}
		return obj;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		//Test t1= new Test();
		//Test() has private access in Test

		Test t1= new Test.getObject();
		Test t2= new Test.getObject();
		Test t3= new Test.getObject();;

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

		System.out.println(t1.x);
	}
}