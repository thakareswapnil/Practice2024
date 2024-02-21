package LogicalProgram;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {

		String S1 ="12345";
		String S2 ="52134";
		
		 String s3=S1.toLowerCase();
		 String s4=S2.toLowerCase();
		
		char[] arr1 =s3.toCharArray();
		char[] arr2 =s4.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
