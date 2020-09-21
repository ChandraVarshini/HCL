//Exception
public class Exception {
	public static void main(String[] args) {
		int a,b,c;
		try {
			try
			{
				a=0;
				b=10;
				c=b/a;
				System.out.println("This line will not be executed");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divided by zero"); 
			}
			String firstArg = args[0];
			System.out.println("First Argument: " + firstArg);
		} 

		catch (IndexOutOfBoundsException ex) {
			System.out.println("There is no argument");
		} 

		finally {
			System.out.println("Finally gets executed");
		}
	}
}
