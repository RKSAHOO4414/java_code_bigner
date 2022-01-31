class Test
{
	void fun(int z) 	//z is local
	{
		z=700;
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		//int x;	//variable x might not have been intialised
		int y=100; 	//local variable
		System.out.println(y);
		Test t=new Test();
		t.fun(600);
		//new Test().fun(600);
	}
}