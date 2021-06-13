import java.util.ArrayList;
import java.util.Scanner;
/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
*/
public class StringSubsequenceUsingArraylist {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		System.out.println(getSS(str).toString());
	}

	public static ArrayList<String> getSS(String str) {
		if(str.length() == 0){
				ArrayList<String> base = new ArrayList<>();
				base.add("");
				return base;
		}
		char firstChar = str.charAt(0);
		ArrayList<String> recResult = getSS(str.substring(1));
		ArrayList<String> res = new ArrayList<>();
		for(String s : recResult){
				res.add(s);
		}
		for(String s : recResult){
				res.add(firstChar + s);
		}
	return res;
	}

}
