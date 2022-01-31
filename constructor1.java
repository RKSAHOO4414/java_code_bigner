class Test
{
	static Test t1;
	static int a;
	Test t2;
	int b;
	public static void main(String[] args) 
	{
		Test t3;
		int c;
		//System.out.println(c); 	//local not have instantiated
		//System.out.println(t3);

		System.out.println(t1);
		System.out.println(a1);

		t1=new Test();
		System.out.println(t1.t2);
		t1.t2.b=20;

		System.out.println(t1.t2.t2);
		t1.t2.t2=new Test();
		System.out.println(t1.t2.t2);
	}
}