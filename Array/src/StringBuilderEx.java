import java.util.Arrays;

public class StringBuilderEx 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("VACD");
		char arr[] = new String(sb1).toCharArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(new StringBuffer(new String(arr)).reverse());
		System.out.println("----------------");
		System.out.println(sb1.insert(0, "Hi "));
		System.out.println(sb1.codePointAt(0));
		System.out.println(sb1.replace(1, 3, "IND"));
		System.out.println(sb1.indexOf("IND"));
		System.out.println(sb1.lastIndexOf("IND"));
		System.out.println(sb1.length());
		System.out.println(sb1.delete(1, 3));
		System.out.println(sb1.substring(2));
		System.out.println(sb1.reverse());
		
		String s1 = new String ("Java     is simple");
		String s2[] = s1.split(" ");
		int count = 0 ;
		for(String x : s2)
		{
			if(!x.isEmpty())
			{
				System.out.println(x +"\t"+x.length());
				count++;
			}
		}		
		System.out.println("No of words : "+count);
	}
}


















