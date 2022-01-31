class Test
{
	public static void main(String[] args) 
	{
		Short x=500;
		System.out.println(x);
		Byte y=(Byte)x;
		System.out.println(y);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println('A'+13);
		System.out.println(012+13);
		System.out.println(0x15+10);
		System.out.println(Integer.toBinaryString(12));

		//program to count no. of bits is on and off (binary level)

		String binary=Integer.toBinaryString(Integer.parseInt(args[0]));
		int zero=0, one=0;
		for (int i=0; i<binary.length(); i++) 
		{
			if(binary.charAt(i)=='0')
				zero++;
			if(binary.charAt(i)=='1')
				one++;
		}
		System.out.println("no. of 0:" +zero);
		System.out.println("no. of 1:" +one);
	}
}