import java.util.HashMap;
import java.util.Map;

/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
public class IntegerToRoman {
	public static String getChar(int n,String c) {
		String s = "";
		for(int i=0; i<n; i++) {
			s = s+c;
		}
		return s;
	}
	//works but not optimal solution
	/*
	public static String intToRoman(int num) {
		if(num == 0) return "";
		
		Map<Integer, String> map = new HashMap<>() {{
			put(1,"I");put(5,"V");put(10,"X");put(50,"L");put(100,"C");put(500,"D");put(1000,"M");
		}};
		String numString = String.valueOf(num);
		String output ="";
		for(int i=0; i<numString.length(); i++) {
			int temp = (i+1 != numString.length())?num - Integer.parseInt(numString.substring(i+1)) : num % 10;
			if(map.containsKey(temp)) {
				output = output + map.get(temp);
			}else {
				if(temp > 1000) {
					for(int j=0; j< temp/1000; j++)
						output = output + "M";
				}else if( temp < 1000 && temp > 500) {
					if( temp == 900)
						output = output + "CM";
					else
						output = output + "D" + getChar((temp - 500)/100, "C"); 
				}else if( temp < 500 && temp > 100) {
					if( temp == 400)
						output = output + "CD";
					else
						output = output + getChar(temp /100, "C"); 
				}else if( temp < 100 && temp > 50) {
					if( temp == 90)
						output = output + "XC";
					else
						output = output + "L" + getChar((temp - 50) /10, "X"); 
				}else if( temp < 50 && temp > 10) {
					if( temp == 40)
						output = output + "XL";
					else
						output = output + getChar(temp /10, "X"); 
				}else if( temp < 10 && temp > 5) {
					if( temp == 9)
						output = output + "IX";
					else
						output = output + "V" + getChar(temp - 5, "I"); 
				}else if( temp < 5 && temp > 1) {
					if( temp == 4)
						output = output + "IV";
					else
						output = output + getChar(temp, "I"); 
				}
			}
			num = (i+1 != numString.length())? Integer.parseInt(numString.substring(i+1)) : 0;
		}
		return output;
    }
    */
	public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] div = {1000, 900, 500, 400, 100, 90, 
                     50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", 
                          "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < div.length;) {
            if (num >= div[i]) {
                result.append(roman[i]);
                num -= div[i];
            } else {
                i++;
            }
        }
        
        return result.toString();
    }
	public static void main(String[] args) {
		System.out.println(intToRoman(1994));
	}

}
