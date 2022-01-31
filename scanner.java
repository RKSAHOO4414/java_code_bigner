class Test
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter your name :");
		String name = sc.nextLine();
		System.out.println("enter the roll");
		int roll=sc.nextInt();

		System.out.println("enter your cgpa");
		Double cgpa=sc.nextDouble();
		System.out.println("enter your fees");
		long fees = sc.nextLong();
		System.out.println("---------------------------");
		System.out.println("name"+name);
		System.out.println("roll"+roll);
		System.out.println("cgpa"+cgpa);
		System.out.println("fees"+fees);
	}
}