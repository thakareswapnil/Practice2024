package LogicalProgram;

import java.util.Scanner;

public class SwappingTwoNwithoutThirdvar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Value of a number\n");
		int a = sc.nextInt();

		System.out.println("enter the Value of b number");
		int b = sc.nextInt();
		
		
	//	a=10  b=20
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("value of a after swapping "+a);
		System.out.println("value of b after swapping "+b);

	}

}
