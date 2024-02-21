package LogicalProgram;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		
		String s1="Hello good evening";
		
		
		//gnineve doog olleH
		
		char[] a=s1.toCharArray();
		
		int l=a.length;
		
		for(int i=l-1;i>=0;i--) {
			
			System.out.print(a[i]);  //gnineve doog olleH
		}
		

	}

}
