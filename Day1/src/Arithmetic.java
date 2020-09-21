//to perform addition,subtraction,multiplication,division

import java.util.Scanner;
public class Arithmetic {
	public static void main(String args[]) {
		int add,sub,mul,div,mod;
		Scanner sc=new Scanner(System.in);
		int value1=sc.nextInt();
		int value2=sc.nextInt();
		add=value1+value2;
		sub=value1-value2;
		mul=value1*value2;
		div=value1/value2;
		mod=value1%value2;
		System.out.println("Addition  "+add);
		System.out.println("subtraction "+sub);
		System.out.println("Multiplication "+mul);
		System.out.println("Division "+div);
		System.out.println("Remainder "+mod);
	}
}
