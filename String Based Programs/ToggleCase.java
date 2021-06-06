import java.util.Scanner;
/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to toggle the case of every character of the given string.\
aBcdEfgHIJ
AbCDeFGhij
*/
public class ToggleCase {

	public static String toggleCase(String str){
    StringBuilder sb = new StringBuilder("");
    for(char c : str.toCharArray()){
      if( c >= 'a' && c <= 'z'){
        sb.append((char)(c - 32));
      }else if(c >= 'A' && c <= 'Z'){
        sb.append((char)(c + 32));
      }
    }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
    scn.close();
		System.out.println(toggleCase(str));
	}

}
