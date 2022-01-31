class Test
{
	int x=200;
	void show()
	{
		int x=100;
		new Demo().display(this,this.x);
	}
	public static void main(String[] args) 
	{
		new Test().show();
	}
}