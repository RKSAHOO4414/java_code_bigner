
public class StringBufferEx2 
{
	public static void main(String[] args) 
	{
		//String palindrome or not
		String s1=new String("Hello");
		System.out.println("The original string is:"+s1);
		StringBuffer sb1=new StringBuffer(s1); 	//string is convrted in to StringBuffer
		sb1.reverse();
		System.out.println("After reverse"+sb1);
		String s2=new String(sb1);
		if (s1.equals(s2))
			System.out.println("yes paliendrom");
		else
			System.out.println("not palindrome");
		//char arr[]=new String(sb1).toCharArray();
		//Now String Buffer contains converted to char Array
	}
}