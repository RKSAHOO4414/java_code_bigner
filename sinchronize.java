class Test
{
	public void printTable(int num)
	{
		for (int i=1; i<=5; i++) 
		{
			System.out.println(num*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			}
		}
	}
}
class user implements Runnable
{
	Table t;
	user1(Table t)
	{
		this.t=t;
		new Thread(this).start();
	}
	public void run()
	{
		t.printTable(6);
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Table t= new Table();
		new user1(t);
		new user2(t);
		new user3(t);
	}
}