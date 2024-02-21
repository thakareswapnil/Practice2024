package December2023;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodetheString {

	public static void main(String[] args) {
		
		String pass="swapnil@123";
		
		byte[] encoded=Base64.encodeBase64(pass.getBytes());
                       //Base64 it is class with encodeBase64 method in it 
		               //pass.getBytes()=pass is string getBytes convert into the byte format 
		
	System.out.println("encoded string is =" +new String (encoded));
		
		
		byte [] decoded =Base64.decodeBase64(encoded);//we have to pass encoded string here 
		
		System.out.println("Decoded password= "+new String(decoded));
	}

}
