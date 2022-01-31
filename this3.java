class Test
{
	int x=10;
	void show()
	{
		System.out.println(this);
		this.x=90;
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
		t1.show();
		System.out.println(t1.x);
		System.out.println(t1);
		t1.x;
		t1.display();
	}
	void display()
	{
		System.out.println(this.x);
	}
}