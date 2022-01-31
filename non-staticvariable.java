class Test
{
	int x;
	int y=100;
	public static void main(String[] args) 
	{
		Test t=new Test();
		Test obj=new Test();
		System.out.println(t.x);
		System.out.print(obj.y);
		System.out.println(t.y+"\t"+obj.y);
		t.y=700;
		System.out.println(t.y+"\t"+obj);
	}
}