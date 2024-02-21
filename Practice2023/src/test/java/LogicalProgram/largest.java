package LogicalProgram;

import java.util.Arrays;

public class largest {
	public static void main(String[] args) {

		int arr[] = { 12, 35,35,35, 1, 10, 34, 1 };
//1.1.10.12.34.35.35.35
		//System.out.println(arr.length);
		int maximum = arr[0]; // 3
		
        int len =arr.length;
        
        System.out.println(len);
        
		// 0<5
		// 1<5
		// 2<5
		// 3<5
		// 5<5 - false
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maximum) {
			
				maximum = arr[i];
			}

		}
		System.out.println("lagest number in given array is -->" + maximum);
		
        Arrays.sort(arr);

        System.out.println("Second largest number in given array -->"+arr[len-2]);

	}
}
