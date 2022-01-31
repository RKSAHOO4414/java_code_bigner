
public class StringEx 
{
	public static void main(String[] args) 
	{
		String s1= new String("hello");
		System.out.println(s1);
		System.out.println(s1.charAt(0));	//char based on 0th index
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.equals("Hello"));
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equalsIgnoreCase("hello"));
		
		
		System.out.println(s1.compareTo("Hello"));	//check the contents of 2 string & return the difference between  ascii value of first mismatch case
			
		System.out.println(s1.compareToIgnoreCase("hello"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		
		int count=0;
		for (int i = 0; i < args.length; i++) 
		{
			if (s1.charAt(i)=='l') 
				count++;
		}
		System.out.println("no of time 'l' occurs :"+ count);
		System.out.println();
		
		System.out.println(s1.codePointCount(1, 3));
		System.out.println(s1.offsetByCodePoints(2, 4));
		//System.out.println(s1.getChars(1,3,2, 1, 2, 4));
		//System.out.println(s1.contentEquals(3));
		System.out.println(s1.contentEquals(null));
		//System.out.println(s1.regionMatches(2, 1, 4, 1));
		//System.out.println(s1.startsWith(2));
		//System.out.println(s1.endsWith(3));
		//System.out.println(s1.hashCode(s1));
		System.out.println(s1.indexOf(3));
		System.out.println(s1.indexOf(1));
		System.out.println(s1.lastIndexOf(4));
		System.out.println(s1.lastIndexOf(2, 4));
		//System.out.println(s1.concat(3,4));
		//System.out.println(s1.replace(1, 0));
		//System.out.println(s1.replaceAll(0, 3));
		System.out.println();
		
		
		String s2="null";
		System.out.println(s2.isEmpty());
	}
}
