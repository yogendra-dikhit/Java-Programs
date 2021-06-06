import java.util.Scanner;
/*
1. You are given a string.
2. You have to print all palindromic substrings of the given string.
Sample Input:
abcc
Sample Output:
a
b
c
cc
c
*/
public class PalindromicSubstrings {

  public static boolean isPalindrome(String s){
        int i=0, j=s.length() -1;
        while(i<j){
            if(!s.substring(i,i+1).equals(s.substring(j,j+1)))
                return false;
            i++; j--;
        }
    return true;
  }

	public static void solution(String str){
		for(int i=0; i<=str.length(); i++){
		    for(int j=i+1; j<=str.length(); j++){
		        String s = str.substring(i,j);
		        if(isPalindrome(s)){
		            System.out.println(s);
		        }
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
