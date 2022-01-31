class Test
{
	static final int x;
	static
	{
		java.util.Scanner sc=new Scanner(system.in);
		System.out.println("enter the number .......");
		x= sc.nextInt();
		//x=60; //erorr already intialised
	}
	public static void main(String[] args) 
	{
		System.out.println("main() .......");
		System.out.println(x);
	}
}