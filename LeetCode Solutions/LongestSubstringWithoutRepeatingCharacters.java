 

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 */

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
	
		if(s.length() == 0)
			return 0;
		TreeMap<Integer,String> resMap = new TreeMap<>();
		String result ="";
		for(String ss : s.split("")) {
			if(!result.contains(ss)) {
				result += ss;
			}else {
				resMap.put(result.length(),result);
				result = result.substring(result.indexOf(ss)+1);
				result += ss;
			}
		}
		resMap.put(result.length(), result);
        return resMap.lastKey().intValue();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(""));
	}

}
