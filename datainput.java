class Test
{
	public static void main(String[] args) 
	{
		java.io.DataInputStrime dis=new java.io.DataInputStrime(system.in);
		System.out.print("enter your choice ......");
		char ch=(char)dis.read();
		if(ch=="Y" || ch="y")
			System.out.println("success");
		if(ch=="W" || ch="A")
			System.out.println("not required");
		else
			System.out.println("enter the valid choice ....");
	}
}