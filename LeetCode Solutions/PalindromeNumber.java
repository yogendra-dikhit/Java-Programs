 
/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false
 */
public class PalindromeNumber {
	//works but takes too much time
/*
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x!=0)) return false;
        int temp= x;
        int result =0;
        while(temp!=0) {
        	result = result * 10 + (temp%10);
        	temp /= 10;
        }
        return x == result;
    }
*/    
	//log n time o1 space
	public static boolean isPalindrome(int x) {
		if(x < 0 || (x%10 ==0 && x!=0)) return false;
		int revLast =0;
		while(x > revLast) {
			revLast = revLast * 10 + x%10;
			x /= 10;
		}
		return x == revLast || x == revLast/10;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(11));
	}

}
