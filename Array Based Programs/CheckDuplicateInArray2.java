//find duplicate values in unsorted array

import java.util.Scanner;
import static java.lang.System.out;

public class CheckDuplicateInArray2{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		out.print("Enter the size of array : ");
		int size = in.nextInt();

		int[] arr = new int[size];
		for(int i= 0; i<size; i++){
			out.print("Enter element number "+(i+1)+" : ");
			arr[i] = in.nextInt();			
		}

		//temporary array to store key check values
		int[] arr1 = new int[2*size];
		for(int i= 0; i<2*size; i++){
			if(i%2 == 0)
				arr1[i]=arr[i/2];
			else
				arr1[i]=-1;			
		}		

		int temp= 0; int flag=0;
		for(int i=0; i<arr.length-1; i++){
			temp= arr[i]; flag=0;
			for(int k=0; k<arr.length; k++){
				if( arr1[2*k] == temp ){
					if( arr1[(2*k)+1] == 1)
					{ flag = 1; break; }
				}
			}
			for(int j=i+1; j<arr.length && flag != 1  ; j++){
				if( arr[j] == temp ){
					out.println("Duplicate of "+temp+" found at "+(j+1)+" position.");
					arr1[(2*j)+1]=1;
				}
			}
		}
	}
}