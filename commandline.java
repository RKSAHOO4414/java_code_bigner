class Test
{
	public static void main(String[] args) 
	{
		int x[]={11,22,33,44,55};
		System.out.println(x.length);
		System.out.println(x[1]);
		System.out.println("---------------");
		System.out.println("the length of commandline :");
		System.out.println(args.length);
		if (args.length>0) 
		{
			System.out.println("the args are :");
			for (int i=0; i<args.length; i++) 
			{
				System.out.println(args[i]);
			}
		}
		else 
		{
			System.out.println("no args enter from the commandline .........");
		}
	}
}