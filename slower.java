class Test
{
	public static void main(String[] args) 
	{
		Lang start1=system.currentTim-Millis();
		Test.addUpToN_Pri(10000000000);
		Lang stop1=system.currentTim-Millis();
		System.out.println(stop1 - start1);

		System.out.println("--------------------");

		Lang start2=system.currentTim-Millis();
		Test.addUpToN_Wrap(100000000);
		Lang stop2=system.currentTim-Millis();
		System.out.println(stop2-start2);
		System.out.println("----------------------");

		static void addUpToN_Pri(int range)
		{
			int sum=0;
			for (int i=1; i<=range; i++) 
			{
				int sum=0;
				for (int i=0; i<=range; i++) 
				{
					Integer sum=0;
					for (Integer i=1; i<=range; i++) 
					{
						sum = sum+1;					
										}					
				}
			}
		}
	}
}