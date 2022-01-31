public class Test
{
	Test()
	{
		System.out.println("constructor with in args:");
	}
	public static void main(String[] args) 
	{
		//new Test()	//erorr
		new Test(123);
	}
}