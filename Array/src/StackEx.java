import java.util.*;

public class StackEx 
{
	public static void main(String[] args) 
	{
		Stack<Character> st= new Stack<Character>();
		st.push('A');
		st.push(new Character('A'));
		System.out.println(st);
		st.push('C');
		st.push('D');
		st.push('E');
		st.push('v');
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.search('A')); 	//index strat with
		System.out.println(st.size());
		System.out.println(st.contains('A'));
		Collections.sort(st);
		System.out.println(st);
		Collections.reverse(st);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		st.clear();
		System.out.println(st);
	}
}