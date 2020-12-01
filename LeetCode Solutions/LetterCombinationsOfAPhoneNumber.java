import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png
 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
*/
public class LetterCombinationsOfAPhoneNumber {
	static String [] words = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //dfs solution using backtracking
	public static List<String> letterCombinations(String digits) {
		List<String> combos= new ArrayList<>();
		if(digits.equals(""))
			return Collections.emptyList();
        
        backtrack(combos,digits,"");
        return combos;
    }
	
	public static void backtrack(List<String> combos, String digits, String s){
		if(s.length() == digits.length()) {
			combos.add(s); return;
		}
		int i = s.length();
		int digit = digits.charAt(i) - '0';
		for(char c : words[digit].toCharArray()) {
			backtrack(combos,digits,s+c);
		}
	}
	//bfs solution using FIFO queue
	public static List<String> letterCombinations1(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		while(ans.peek().length()!=digits.length()){
			String remove = ans.remove();
			String map = mapping[digits.charAt(remove.length())-'0'];
			for(char c: map.toCharArray()){
				ans.addLast(remove+c);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(letterCombinations1("23"));
	}

}
