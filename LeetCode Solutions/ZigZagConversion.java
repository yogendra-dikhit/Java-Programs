 

import java.util.Arrays;
import java.util.stream.Stream;

/*
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

P
I   L
S A
G

0     6      13
1   5 7   12 14
2 4   8 11
3     9
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */
public class ZigZagConversion {
	// works but not good with time comp. and space comp.
/*
public String convert(String s, int numRows) {
        if(s == null || s.length() <= 1 || numRows == 1)
    		return s;
    	String [] arr = new String[numRows];
    	Arrays.fill(arr, "");
    	boolean reverse = false;
    	for(int i=0, j=0;i<s.length();i++) {
    		if(j == numRows) {
    			reverse = true;
    			j--;
    		}else if(j == 0 && reverse) {
    			reverse = false;
    			j++;
    		}
    		if(!reverse) {
    			arr[j++] += s.substring(i,i+1);
    		}else {
    			--j;
    			arr[j] += s.substring(i,i+1);
    		}
    	}
    	String output ="";
    	for(String ss : arr) {
    		output += ss;
    	}
        return output;
    }
*/
	// best solution
    public static String convert(String s, int numRows) {
    	if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",4));
	}

}
