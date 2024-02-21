package LogicalProgram;

public class ReverseEachWord2 {

	public static void main(String[] args) {

		String Str = "Hello good evening";
//		 Expected Result - gnineve doog olleH
//		 Expected = olleH doog gnineve
		
		String [] Word =Str.split(" "); //Splitetd string into words
		
		String RevS = "";
		String Rev1 ="";
		
		for(String W :Word) {  //OuterLoop
			String StringWord ="";
			
			for(int i=W.length()-1 ;i>=0;i--) {//ineer loop
				
				StringWord = StringWord+W.charAt(i);
			}
			RevS =RevS+StringWord+" ";
			}
		System.out.println(RevS);

	
		for(int i=RevS.length()-1 ;i>=0 ;i-- ) {
			
			Rev1 = Rev1+RevS.charAt(i);
		}
		System.out.println(Rev1.trim());
		}

	}


