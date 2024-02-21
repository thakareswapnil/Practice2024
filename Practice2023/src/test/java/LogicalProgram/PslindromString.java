package LogicalProgram;

import java.util.Scanner;

public class PslindromString {

	public static void main(String[] args) {
		System.out.println("ENter the string which you want check is palindrom or not ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		int length = s1.length();

		String rev = "";//nitin

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);

		}
		System.out.println(rev);
		if (s1.equals(rev))
			System.out.println("it is palidrom");
		else
			System.out.println("it is not palindrom");

	}
}
