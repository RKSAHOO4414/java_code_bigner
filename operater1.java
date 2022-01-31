class Test
{
	public static void main(String[] args) 
	{
		System.out.println(10&9);
		System.out.println(10 | 9);
		System.out.println(10 ^ 9);
		System.out.println(10&9 | 14&13);
		int x=10, y=20;
		if(x++ > 100 && --y>30)
			System.out.println(x+ "\t" +y+ "if");
		else
			System.out.println(x+ "\t" +y+ "else");
		//int x=10,y=20;
		if(x++ < 100 || --y > 30)
			System.out.println(x+"\t"+y+"if");
		else
			System.out.println(x+"\t"+y+"else");
		System.out.println(10>>2);
		System.out.println(-10>>2);
		System.out.println(20>>3);
		System.out.println(-21>>2);
		System.out.println(10<<2);
		System.out.println(-10>>>28);	//unsigned right shift
		int a=10;
		a+=10;
		System.out.println(a);
		System.out.println(10>2);
		//ternary | if.....else
		int res=10>2 ? 10:2;
		System.out.println(res);
		java.lang.System.out.println(Integer.SIZE);
	}
}