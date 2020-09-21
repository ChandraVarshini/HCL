import java.util.Scanner;
public class Vowels {
//to find number of vowels
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string1 = in.nextLine();

		System.out.print("Number of  Vowels in the string: " + countVowels(string1)+"\n");
	}
	public static int countVowels(String string1)
	{
		int count = 0;
		for (int i = 0; i < string1.length(); i++)
		{
			if (string1.charAt(i) == 'a' || string1.charAt(i) == 'e' || string1.charAt(i) == 'i'
					|| string1.charAt(i) == 'o' || string1.charAt(i) == 'u')
			{
				count++;
			}
		}
		return count;
	}
}

