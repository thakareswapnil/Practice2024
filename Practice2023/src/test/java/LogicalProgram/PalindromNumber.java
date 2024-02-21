package LogicalProgram;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {

		int temp = 0;
		int rev = 0;
		int ong;
		System.out.println("enter the number which to be checked");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();//121
		ong = num;//ong=121
		//12
		//1
		
		while (ong != 0) {
			temp = ong % 10;
			rev = rev * 10 + temp;//1*10+2=12*10+1
			ong = ong / 10;

		}
		if (rev == num)
			System.out.println("it is palindrom");
		else
			System.out.println("it is not palindrom");
	}

}
