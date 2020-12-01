/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
	//works but not an optimal solution
/*
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 1) return strs[0];
		StringBuilder sb = new StringBuilder("");

		for(int i=0; i<strs.length; i++) {
			int j=0;
			if(sb.toString().equals("")) {
				while( j<strs[i].length() && j< strs[i+1].length()) {
					if( strs[i].charAt(j) == strs[i+1].charAt(j)) {
						sb.append(strs[i].charAt(j));
					}else {
						break;
					}
					j++;
				}
				i++;
			}else {
				j=0;
				String temp = "";
				while(j<sb.length() && j<strs[i].length()) {
					if(strs[i].charAt(j) == sb.charAt(j))
						temp = temp + sb.charAt(j);
					j++;
				}
				sb = new StringBuilder(temp);
			}
			if(sb.toString().equals(""))
				break;
			
		}
        return sb.toString();
    }
    */
	//works faster
	private static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		String prefix = strs[0];
		for(int i=1; i<strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
			if(prefix.isEmpty())
				break;
		}
		return prefix;
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"abab","aba","a"}));
	}


}
