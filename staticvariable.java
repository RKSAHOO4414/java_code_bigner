class Demo
{
	static int x;
	static boolean y;
	static int z=10;

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(Demo.z);

		Demo d=new Demo();
		Demo d1=new Demo();

		System.out.println(d.z+"\t"+d1.z);
		d1.z=20;
		System.out.println(d.z+"\t"+d1.z);
	}
}