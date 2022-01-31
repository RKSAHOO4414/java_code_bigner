class Test
{

}
class Demo extends Demo
{
	Demo d1=new Test(); 	//error at compile time incompatable types
	Demo d1=(Demo) new Test();	//class casting it throws class cast exception at run time

	Try
	{
		Demo d1=(Demo) new Test();
	}
	catch(classCastException c)
	{
		System.out.println("down() casting .........");
	}
}