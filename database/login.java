import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/*import java.awt.event.ActionListner;
import java.awt.event.ActionEvent;*/

class Test extends JFrame implements ActionListener
{
	JLabel l1, l2,l3;
	JTextField tf1;
	JPasswordField ps1;
	JButton b1, b2, b3;
	Connection con;

	Test()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle ("Login page");
		setLayout(null);
		getContentPane() . setBackground(Color.cyan);

		l1= new JLabel ("Login Here");
		l2= new JLabel ("UserName");
		l3= new JLabel ("Password");

		tf1 = new JTextField();
		ps1 = new JPasswordField();

		b1= new JButton ("Submit");
		b3= new JButton ("register");
		b2= new JButton ("Reset");

		l1.setForeground(Color.red);
		//l2.setForeground(Color.blue);
		//l3.setForeground(Color.green);


		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(ps1);
		add(b1);
		add(b2);
		add(b3);

		l1.setBounds(150, 30, 200, 30);
		l2.setBounds(50, 80, 60, 30);
		l3.setBounds(50, 130, 60, 30);

		tf1.setBounds(120, 80, 230, 30);
		ps1.setBounds(120, 130, 230, 30);

		b1.setBounds(120, 170, 80, 30);
		b2.setBounds(300, 170, 80, 30);
		b3.setBounds(210, 170, 80, 30);

		setVisible(true);
		setSize (300, 300);

		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:6873:xe","system","system");
			if (con != null) 
			{
				System.out.println("connection with DB");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		b1.addActionListener(this);
		b2.addActionListener(this);
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		//logic
		try
		{

			
			if (text.equalsIgnoreCase("Submit")) 
			{
				String u= tf1.getText();
				String p= ps1.getText();
				String sql = "select * from users where user_name='"+u+"' and Password='"+p+"'";
				Statement st= con.createStatement();
				ResultSet rs= st.executeQuery(sql);
				if (rs.next()) 
				{
					JOptionPane.showMessageDialog(null, "yes login success");

				}
				else 
				{
					JOptionPane.showMessageDialog(null, "iNVALID USER NAME OAD Password");	
				}

			}
			/*if (text.next("register")) 
			{
				String u= tf1.getText();
				String p= ps1.getText();
				String sql = "insert into users values('"+u+"', '"+p+"');";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
			}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if (text.equalsIgnoreCase("reset")) 
		{
			tf1.setText("");
			ps1.setText("");
		}
		

	}

	public static void main(String[] args) 
	{
		new Test();
	}
}