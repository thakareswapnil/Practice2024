package LogicalProgram;

public class removeVowels {

	public static void main(String[] args) {
		String input = "Hello, World!";

int o=0;
int e=0;      
        for (int i = 0; i < input.length(); i++) {

        	char c=input.charAt(i);
        	
        	 if (c == 'o' ) {
        		 o++;
        	 }
        	 else
        		 if(c=='e')
        		 {
        			 e++;
        		 }
        	 
        	
        	 
        	 
	}
        System.out.println(o);

        System.out.println(e);
	}
}


