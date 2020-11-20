

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
 * Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
 */
public class CommonCharacterCount {

	public int commonCharacterCount(String s1, String s2) {
	    Map<String, Integer> map = new HashMap<>();
	    int[] count ={0};
	    for(String s : s1.split("")){
	        map.put(s, map.getOrDefault(s, 0)+1);
	    }
	    Stream.of(s2.split("")).forEach(s -> {
	        if(map.containsKey(s) && map.get(s) > 0){           
	            map.put(s, map.get(s) -1);
	            count[0]++;
	        }
	    });
	return count[0];
	}
}
