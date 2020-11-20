
//Given the string, check if it is a palindrome.
//
//Example
//
//For inputString = "aabaa", the output should be
//checkPalindrome(inputString) = true;
//For inputString = "abac", the output should be
//checkPalindrome(inputString) = false;
//For inputString = "a", the output should be
//checkPalindrome(inputString) = true.
public class CheckPalindrome {

	public boolean checkPalindrome(String inputString) {
	    int length = inputString.length();
	    for( int i=0; i<length/2; i++){
	        if( inputString.charAt(i) != inputString.charAt(length-1 -i))
	        return false;
	    }
	return true;
	}
	
}
