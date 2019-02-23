package testing;

public class A {

	static A  o= null;
	private A()
	{
		
	}
	
	public static A getObject()
	{
		if(o==null)
		{
			o = new A();
		}
				
		return o;
	}
	
}
