
public class ExceptionEx 
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		try {
				System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException are) 
		{
			System.out.println("exception caught ......");
			System.out.println("plz enter argument for comand line ...");
		}
		System.out.println("terminates normally ...");
	}
}
