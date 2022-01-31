class Test
{
	int x;
	final static int y=100;
	final int z=400;
	public static void main(String[] args) 
	{
		System.out.println(new Test().x);
		System.out.println(y);
		Test obj=new Test();
		//obj.y=800;	//error
		System.out.println(y);
		System.out.println(obj.z);
	}
}