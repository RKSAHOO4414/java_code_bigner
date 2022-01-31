//main() methode overloading
class Test
{
	final void show()
	{

	}
	final void show(int x)
	{

	}
	void area(int r)
	{
		System.out.println("area of circle:"+3.14*r*);
	}
	void area(int l,w)
	{
		System.out.println("area of rect:"+l*w);
	}
	public static void main(String[] args) 
	{
		System.out.println("main() of array with String args");
		Test.main("hello");
		new.Test().area(4);
		new.Test().area(3,4);
	}
	public static void main(String[] args) 
	{
		System.out.println("main() with string args");
	}
}