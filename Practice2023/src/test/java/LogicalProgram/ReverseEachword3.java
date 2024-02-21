package LogicalProgram;

public class ReverseEachword3 {

	public static void main(String[] args) {

		String str = "Hello good evening";
		
		//expected ="evening good Hello"
		
		String rword="";
		
		String [] word=str.split(" ");//this will split string into each word
		
		for(int j=word.length-1;j>=0;j--) {
			
			rword += word[j] + " ";
		}
		System.out.println(rword);//evening good Hello 
		
		
		
	//	expected =olleH doog gnineve 
		for(String w:word) {
			
			
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
				
			}
			System.out.print(reverseword+" ");
		}
       
 	}

}
