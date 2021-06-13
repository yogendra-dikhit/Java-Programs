import java.util.Scanner;
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input.
4. For the purpose complete the body of maxOfArray function. Don't change the signature.
Sample Input
6
15
30
40
4
11
9
Sample Output
40
*/
public class MaxInArray {

	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
				s.close();
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length -1)
            return arr[idx];
        int max = maxOfArray(arr,idx+1);
        return arr[idx] > max ? arr[idx] : max ;
    }
}
