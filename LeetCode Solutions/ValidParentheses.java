 
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 */
public class ValidParentheses {

	public static boolean isValid(String s) {
		if(s.length() ==0)return false;
		char [] stack = new char[s.length()];
		int top =-1;
		boolean isValid = true;
		for(char c : s.toCharArray()) {
			switch(c) {
			case '(' : case '[' : case '{' :
				stack[++top] = c;
				break;
			default :
				if(top == -1) {
					isValid = false; break;
				}
				if((c == ')' && stack[top] == '(') || (c == '}' && stack[top] == '{') || (c == ']' && stack[top] == '[')) 
					top--;
				else {
					isValid = false; break;
				}
				
			}
			if(!isValid)
				break;
		}
        return top == -1 && isValid;
    }
	public static void main(String[] args) {
		System.out.println(isValid("{[]}("));
	}

}
