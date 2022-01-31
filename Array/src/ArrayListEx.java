import java.util.ArrayList;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new  ArrayList<Integer>();
		System.out.println(list);
		list.add(100);
		list.add(new Integer(100)); //auto boxing
		list.add(0,400);
		list.add(10);
		list.add(list.size(),1);
		list.add(80);
		System.out.println(list);
		System.out.println(list.contains(11));
		System.out.println(list.size());
		System.out.println(list);
		list.remove(list.size()-1);
		list.remove(0);
		System.out.println(list);
	}
}