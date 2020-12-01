 

/*
 Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 */
public class ReverseInteger {
	//worst solution but works
/*
	public static int reverse(int x) {
		if (x == 0)
			return x;
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
			return 0;
		
		StringBuilder initStr = new StringBuilder(""+x);
		String isSigned = "";

		if(initStr.substring(0,1).equals("-") || initStr.substring(0,1).equals("+")){
			isSigned = initStr.substring(0,1); initStr = initStr.replace(0, 1, ""); 
		}
		if(Integer.parseInt(initStr.substring(0,1).toString()) == 0)
			initStr = initStr.replace(0, 1, "");

		String res = initStr.reverse().toString();
		long finalResult = Long.parseLong(res);
		if(finalResult > Integer.MAX_VALUE || 0-finalResult < Integer.MIN_VALUE)
			return 0;
		x = (int) finalResult;
		
		if(isSigned.equals("-"))
			x = 0 - x;

		return x;
	}
*/
	//best solution with least time complexity
/*
	public static int reverse(int x) {
		long rev =0;
		while(x != 0) {
			int temp = x % 10;
			x /= 10;
			if(rev*10+ temp >= Integer.MAX_VALUE || (rev*10+ temp) <= Integer.MIN_VALUE) return 0;
			rev = rev * 10 + temp;
		}
		return (int) rev;
	}
*/
	// best solution with best readability and slightly more time comp.
	public static int reverse(int x) {
		String rev = new StringBuilder().append(Math.abs(x)).reverse().toString();
		try {
			return (x > 0) ? Integer.parseInt(rev) : Integer.parseInt(rev) * -1;
		} catch (Exception e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(reverse(-2147483648));
	}

}
