
import java.util.Comparator;
import java.util.stream.Stream;

/*
 * Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 */
public class AllLongestStrings {

	public String[] allLongestStrings(String[] inputArray) {
		int length = 
				Stream.of(inputArray).max(Comparator.comparingInt(String :: length)).get().length();

		inputArray = 
				Stream.of(inputArray).filter(s -> s.length() == length).toArray(String[] :: new);
		return inputArray;
	}
}
