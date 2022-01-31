class Test
{

}
class Demo
{

}
class Myclass
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Demo d1=new Demo();
		Myclass mc=new Myclass();
		System.out.println(t1);
		System.out.println(t1.getClass());	//class Test
		System.out.println(t1.getClass().getName());
		System.out.println(t1.getClass().getName()+Integer.toHexString(t1.hashCode()));
		System.out.println(t1.hashCode());
	}
}