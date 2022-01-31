class Demo
{
	Demoget()
	{
		return this;
	} 
	int x=300;
	void display(Test obj, int x)
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(obj.x);
		this.x=x;
		System.out.println("return value from get()"+get());
	}
}