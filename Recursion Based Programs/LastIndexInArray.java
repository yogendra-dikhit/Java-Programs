import java.util.Scanner;
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the last index at which x occurs in array a.
5. If x exists in array, print the last index where it is found otherwise print -1.
Sample Input
6
15
11
40
4
4
9
4
Sample Output
4
*/
public class LastIndexInArray {

	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
				s.close();
				System.out.println();
        System.out.println(lastIndexV1(arr,arr.length-1,x));
        System.out.println(lastIndexV2(arr,0,x));
  }

    public static int lastIndexV1(int[] arr, int idx, int x){
        if(idx < 0)
            return -1;
        else if(arr[idx] == x)
            return idx;
        return lastIndexV1(arr,idx-1,x);
    }

    public static int lastIndexV2(int[] arr, int idx, int x){
        if(idx == arr.length)
            return -1;
        int index = lastIndexV2(arr,idx+1,x);
				return index != -1 ? index : (arr[idx] == x ? idx : -1);
    }
}
