import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame   implements ActionListener , Runnable
{
	JTextField tf1;
	JButton b1 ; 
	JTextArea ta1 ; 
	JScrollPane p1 ; 

	ServerSocket ss ; 
	Socket s1 ; 
	PrintWriter pw ; 
	BufferedReader br ; 

	public Client() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle ("Chat Client ..");
		tf1 = new JTextField ();
		ta1 = new JTextArea ();
		p1 = new JScrollPane (ta1);
		b1 = new JButton("Send");
		
		tf1.setBounds (30,30,150,30);
		b1.setBounds (190,30,70,30);
		p1.setBounds (30,70,230,250);

		add (tf1);
		add (b1);
		add (p1);

		try
		{
			//ss = new ServerSocket(3000); // Only for server 
			// s1 = ss . accept(); // Only for server 
			s1 = new Socket (InetAddress.getByName("localhost"),3000); // only for client
			br = new BufferedReader (new InputStreamReader (s1.getInputStream()));
			pw = new PrintWriter (s1.getOutputStream(),true);
		}
		catch(Exception e)
		{
		}
		
		setVisible(true);
		setSize(330,400);
		b1 . addActionListener(this);
		tf1 . addActionListener(this);

		new Thread (this) . start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				String  text = br.readLine();
				ta1 . append (text  +"\t-Sender \n");
			}
			catch(Exception e)
			{				
			}
		}
	}
	public  void actionPerformed (ActionEvent ae)
	{
		String text = tf1.getText();
		pw.println(text);
		ta1 . append (text  +"\t-Me \n");
		tf1.setText("");
	}
	public static void main(String[] args) throws Exception 
	{
		new Client();
	}
}

