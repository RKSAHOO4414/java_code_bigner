// Client.java
import java.net.*;
class Client 
{
	public static void main(String[] args) throws Exception
	{
		Socket s1 = new Socket (InetAddress.getByName ("Bishnu"),4000);


	}
}

/*
// Client.java
import java.net.*;
import java.io.*;

class Client 
{
	public static void main(String[] args) throws Exception
	{
		Socket s1 = new Socket (InetAddress.getByName ("Bishnu"),4000);

		PrintWriter pw = new PrintWriter (s1.getOutputStream(),true);
		pw.println ("Hello Student ");

		pw.close();
		s1.close();
	}
}
*/