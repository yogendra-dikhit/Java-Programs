
public class PalindromeNumber {
    public static void checkPalindromeNumber(int num) {
		int rem=0, temp=0, result=0;
		temp = num;
		
		while( temp != 0){
	        rem =  temp % 10;
	        result = result * 10 + rem;
	        temp = temp / 10;
		}
		if( num == result ) {
			System.out.println(num + " is a Palindrome Number");
		}else {
			System.out.println(num + " is not a Palindrome Number ");
		}
	}
	
}
