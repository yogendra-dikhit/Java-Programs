 
// Note : Both of the solutions below work. the catch is first one takes more time and space as compared to second one

/*
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
Example 3:

Input: "bb"
Output: "bb"
Example 4:

Input: "ac"
Output: "a"

 */
/*public class LongestPalindromicSubstring {
	static boolean checkPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
    public static String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        int maxLen =0;
        String maxStr = "";
        for(int i=1; i<s.length(); i++) {
        	int left = i, right = i;
        	while(!(left == 0 || right+1 == s.length())) {
        		left = (left-1 > -1) ? left-1 : left;
        		String temp = s.substring(left,right+1);
        		if( checkPalindrome(temp) && temp.length() > maxLen) {
        			maxLen = temp.length();
        			maxStr = temp;
        		}
        		right = (right+1 < s.length())? right+1 : right;
        		temp = s.substring(left,right+1);
        		if( checkPalindrome(temp) && temp.length() > maxLen) {
        			maxLen = temp.length();
        			maxStr = temp;
        		}
        	}
        }
        return maxStr.equals("") ? s.substring(0,1) : maxStr;
    }

	public static void main(String[] args) {
		System.out.println(longestPalindrome("bb"));
	}

}*/

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if( s != null && s.length() == 1) {
        	return s;
        }
        int start=0, end=0, len1=0, len2=0, len=0;
        for(int i=0; i<s.length(); i++) {
        	len1 = expandAroundCenter(s, i, i);
        	len2 = expandAroundCenter(s, i, i+1);
        	len = Math.max(len1, len2);
        	if(len > end-start) {
        		start = i - (len -1)/2;
        		end = i + len/2;
        	}
        }
        return s.substring(start,end+1);
    }
    public static int expandAroundCenter(String s, int left, int  right) {
    	if(left > right)
    		return 0;
    	
    	while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    		left--;
    		right++;
    	}
    	return right -1 - left;
    }

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}

}
