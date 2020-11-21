//find duplicate values in unsorted array
import java.util.Scanner;
import static java.lang.System.out;

public class CheckDuplicateInArray{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		out.print("Enter the size of array : ");
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i= 0; i<size; i++){
			out.print("Enter element number "+(i+1)+" : ");
			arr[i] = in.nextInt();			
		}

		int temp= 0;
		for(int i=0; i<arr.length-1; i++){
			temp= arr[i];
			for(int j=i+1; j<arr.length; j++){
				if( arr[j] == temp )
					out.println("Duplicate of "+temp+" found at "+(j+1)+" position.");
			}
		}
	}
}