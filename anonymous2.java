//example create the object of abstract class with the help of anonymous class.\
abstract class Area
{
	abstract void area();
}
class Test
{
	public static void main(String[] args) 
	{
		//area a1=new area(); //error can be instantiated
		Area a1=new  Area()
		{
			void area()
			{
				System.out.println("logic to find the area of triangle");
			}
		};
		Area a2= new Area()
		{
			void area()
			{
				System.out.println("logic to find the area of rect");
			}
		};
		a1.area();
		a2.area();
	}
}