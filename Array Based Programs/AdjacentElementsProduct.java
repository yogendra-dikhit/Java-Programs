
//Given an array of integers, find the pair of adjacent elements that has 
//the largest product and return that product.

//Example
//
//For inputArray = [3, 6, -2, -5, 7, 3], the output should be
//adjacentElementsProduct(inputArray) = 21.
//
//7 and 3 produce the largest product.
public class AdjacentElementsProduct {

	public int adjacentElementsProduct(int[] inputArray) {
		int largest = inputArray[0] * inputArray[1];
	    for( int i=1; i<inputArray.length -1; i++){
	        
	        int product =  ( inputArray[i] * inputArray[i+1]);
	        largest =   (product > largest ) ? product : largest; 
	    }
	return largest;
	}
	
}
