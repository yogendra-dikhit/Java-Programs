import java.util.Scanner;
/*
1. You are given a string.
2. You have to compress the given string in the following two ways -
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
*/
class StringCompression {

  public static String compression1(String str){
		String result = "";
		for(int i=0; i<str.length(); i++){
		    String s = str.substring(i,i+1);
		    if(!result.endsWith(s)){
          result += s;
        }
		}
		return result;
	}

	public static String compression2(String str){
		String result = "";
    int count =1;
		for(int i=0; i<str.length(); i++){
		    String s = str.substring(i,i+1);
		    if(!result.endsWith(s)){
          if(count != 1)
            result += count;
          result += s;
          count = 1;
        }else{
          count++;
        }
		}
    if(count != 1)
      result += count;
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}