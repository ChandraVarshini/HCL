
class X
{
	public void method1()
	{
		System.out.println("Class X method");
	}
}
class Y extends X
{
	public void method2()
	{
		System.out.println("class Y method");
	}
}
class Z extends Y
{
	public void method3()
	{
		System.out.println("class Z method");
	}
} 
public class MultipleInheritance
{
	public static void main(String args[])
	{
		Z obj = new Z();
		obj.method1(); 
		obj.method2(); 
		obj.method3(); 
	}
}

