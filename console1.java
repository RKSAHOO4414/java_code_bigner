class Test
{
	public static void main(String[] args) 
	{
		java.io.Console c=system.Console();
		System.out.println("enter the user name...");
		String user name=c.readLine();
		System.out.println("entre the password");
		char ps[]=c.readLine();
		String password = new String(ps);
		System.out.println("enter the apssword:"+password);
		//validation
		for (int i=0; i<password.length(); i++) 
		{
			if (Character.isDigit(password.charAt(i))) 
				digit++;
			if(Character.isUpperCase(password.charAt(i)))
				upper++;
		}
		if(password.length(i<0))
			System.out.println("password should be at least 1 digit");
		else
		if(digit==0)
			System.out.println("password should contain at least 1 digit");
		else
		if(Upper==0)
			System.out.println("password should conatin 1 upper case letter");
		else
			System.out.println("valid password");
	}
}