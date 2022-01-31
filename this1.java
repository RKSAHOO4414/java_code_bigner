class Test
{
	int x=90;
	void show()
	{
		int x=900;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		new Test().show();
	}
}