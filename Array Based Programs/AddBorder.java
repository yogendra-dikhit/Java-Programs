import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example
For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
 * 
 */
public class AddBorder {

	public String[] addBorder(String[] picture) {
	    int length = picture.length;
	    int characters = picture[0].length();
	    String toAttach = "**";
	    
	    for(int i=0; i<characters; i++){ toAttach += "*" ;}
	    for(int i=0; i<length; i++){
	        picture[i] = "*"+picture[i]+"*";
	        System.out.println(picture[i]);
	    }
	ArrayList<String> list =Stream.of(picture).collect(Collectors.toCollection(ArrayList :: new));
	    list.add(0, toAttach.toString());
	    list.add(list.size(),toAttach.toString());
	    picture = list.toArray(picture);
	return picture;
	}

}
