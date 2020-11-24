import java.util.HashMap;
import java.util.Map;

public class PalindromeNumberWithMap {
    public static void checkPalindromeWithMap(int num ) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int temp=0;
		
		while( temp != 0) {
			if( map.containsKey( temp%10) ) {
				map.put( temp%10 , map.get(temp%10) + 1 );
			}else {
				map.put( temp % 10, 1);
			}
			temp = temp /10;
		}
		int count=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			if( entry.getValue() % 2 != 0) {
				System.out.println(entry.getValue());
				count++;
			}
		}
		if( count == 0 || count == 1 ) {
			System.out.println(num + " is a Palindrome Number " );
		}else {
			System.out.println(num + " is not a Palindrome Number");
		}
		
	}

}