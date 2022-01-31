class Vehicle
{
	final void run()	//erorr is cycle cannot override run() in Vehicle
	{
		System.out.println("Vehicle is running seafly with speed 50");
	}
}
class Cycle extends Vehicle
{
	void run()	//erorr
	{
		System.out.println("cycle is running seafly with speed 5");
	}
	public static void main(String[] args) 
	{
		Cycle c=new Cycle();
		c.run();
	}
}