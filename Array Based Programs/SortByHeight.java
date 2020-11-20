
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

/*
 * Some people are standing in a row in a park. There are trees between them which cannot be moved.
 *  Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
 *   People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */
public class SortByHeight {

	public int[] sortByHeight(int[] a) {
		LinkedList<Integer> list = (LinkedList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toCollection(LinkedList :: new));
		list.removeAll(Collections.singleton(-1));
		    Collections.sort(list);
		    for(int i=0; i<a.length;  i++){
		        if( a[i] != -1){
		            a[i]= list.pollFirst();
		        }else
		            continue;
		    }
		return a;
		}
}
