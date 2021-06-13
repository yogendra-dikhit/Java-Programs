import java.util.Scanner;

public class FirstIndexInArray {

	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
				s.close();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
            return -1;
        else if(arr[idx] == x)
            return idx;
        return firstIndex(arr,idx+1,x);
    }
}
