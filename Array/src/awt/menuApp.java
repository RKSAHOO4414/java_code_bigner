package awt;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class menuApp extends JFrame implements ActionListener 
{
	JTextArea ta1;
	menuApp()
	{
		setTitle("notepad");
		setDefaultCloseOperation(JFrame, EXIT_ON_CLOSE);
		ta1=new JTextArea();
		JScrollPane p1=new JScrollPane(ta1);
		add(p1);
		JMenuBar mbr =new JMenuBar();
	}
}
