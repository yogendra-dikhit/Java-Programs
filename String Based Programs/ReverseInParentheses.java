/*
 * Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 */
public class ReverseInParentheses {

	public String reverseInParentheses(String inputString) {
	    StringBuilder inputString2 = new StringBuilder(inputString);
	    int start = inputString2.lastIndexOf("(") , end =inputString2.indexOf(")", start);
	    
	    while( start != -1){
	        
	    inputString2.replace(start, end+1, new StringBuilder(inputString2.substring(start +1 , end)).reverse().toString());
	        start = inputString2.lastIndexOf("(");
	        end = inputString2.indexOf(")" , start);
	    }

	return inputString2.toString();
	}
}
