class Test
{
	public static void main(String[] args) 
	{
		System.out.println(10);
		System.out.println(Integer.toString(10));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10)+2);
		System.out.println(Integer.parseInt(Integer.toBinaryString(10))+2);

		float a=(float)2.5;
		float b=2.5f;
		System.out.println(a);
		System.out.println(3.5 == 3.5f);
		System.out.println(3.2 == 3.2f);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.VALUE);
	}
}