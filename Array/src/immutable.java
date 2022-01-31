
public final class immutable 
{
	private final String name;
	immutable(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public String concat(String s)
	{
		return name+s;
	}
	
	public static void main(String[] args) 
	{
		immutable t=new immutable("something");
		System.out.println(t);
		System.out.println(t.concat("DJpravu"));
		System.out.println(t);
		t=new immutable("DJpravu");
		System.out.println(t);
	}
}
