package LogicalProgram;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.units.qual.Length;

public class MoveZeroTORight {

	public static void main(String[] args) {

		int []a= {2,1,0,3,0,0,8};
		   //[2, 1, 3, 0, 0]
		
		   //[0,0,0,3,1,2]
		
		int len=a.length;
		
		int [] nArray=new int[len];
		
          int index=0;
          
		for(int num:a) {
			
			if(num!=0) {
				
				nArray[index]=num;
				index++;
			}
		}
		
		System.out.println(Arrays.toString(nArray));
		
		
	}


}

