import java.util.*;

public class vectorEx 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<Integer>();
		v.addElement(11);
		v.addElement(22);
		v.addElement(33);
		v.add(21);
		v.add(31);
		v.add(41);
		System.out.println(v);
		System.out.println(v.size());
		v.removeElement(31);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println("Traverse by enumneration interface ...");
		Enumeration<Integer> e=v.elements();
		while (e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());			
		}
	}
}
