class A
{
	public void show()
	{
		System.out.println("Base class method");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("Child class method");
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show(); 
		obj.display(); 
	}
}

