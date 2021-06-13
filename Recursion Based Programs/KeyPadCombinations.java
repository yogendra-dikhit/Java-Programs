import java.util.ArrayList;
import java.util.Scanner;
/*
1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.
Sample Input
78
Sample Output
[tv, tw, tx, uv, uw, ux]
*/
public class KeyPadCombinations {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		System.out.println(getKPC(str));
	}

	private static String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static ArrayList<String> getKPC(String str) {
		if(str.length() == 0){
				ArrayList<String> base = new ArrayList<String>();
				base.add("");
				return base;
		}
		String first = str.substring(0,1);
		ArrayList<String> recList = getKPC(str.substring(1));
		ArrayList<String> resList = new ArrayList<>();
		String values = keys[Integer.parseInt(first)];
		for(String s : values.split("")){
				for(String recS : recList){
						resList.add(s + recS);
				}
		}
	return resList;
	}
}
