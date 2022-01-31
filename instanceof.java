class Demo
{

}
class Test extends Demo
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Demo d1=new Demo();
		System.out.println(t1.instanceOf.Test);
		System.out.println(t1.instanceOf.Demo);
		System.out.println(d1.instanceOf.Temo);
		System.out.println(d1.instanceOf.Demo);
	}
}