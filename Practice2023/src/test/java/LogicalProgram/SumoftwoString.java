package LogicalProgram;

import java.util.Scanner;

public class SumoftwoString {//given string should number only

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first string ");
		String s1=sc.nextLine();
		
		System.out.println("enter the second  string ");
		String s2=sc.nextLine();
		
		
		
		int n1=Integer.parseInt(s1);//convert string into number  
		
		int n2=Integer.parseInt(s2);
		
		System.out.println("addition of two string is "+(n1+n2));
				
		

	}

}
