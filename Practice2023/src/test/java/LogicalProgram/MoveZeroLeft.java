package LogicalProgram;

import java.util.Arrays;

public class MoveZeroLeft {

	public static void main(String[] args) {

//		int []a= {0,2,1,0,3,0,0};
//		
//		int len=a.length;
//		
//		int [] newarray=new int [len];
//		
//		int NAindex=len-1;
//		
//		for(int num:a) {
//			if(num!=0) {
//				newarray[NAindex]=num;
//				NAindex--;
//			}
//		}
//		System.out.println(Arrays.toString(newarray));
//	}
	int[] inputSequence = { 1, 3, 4, 5, 0, 2, 3, 0, 2, 4, 0 };
                         //0 ,0 ,0 ,4 ,2 ,3 ,2 ,5 ,4 ,3 ,1
	
	int[] resultSequence = inputSequence;

	int nonZeroCount = 0;

	int[] newSequence = new int[inputSequence.length];

	for (int num : inputSequence) {

		if (num != 0) {

			newSequence[nonZeroCount] = num;
			nonZeroCount++;
		}
	}
	String Str = Arrays.toString(newSequence);

	String Rev = "";

	for (int i = Str.length() - 2; i > 0; i--) {

		Rev = Rev + Str.charAt(i);
	}
	System.out.println(Rev);
}

}
