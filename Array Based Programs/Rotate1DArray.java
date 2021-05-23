import java.util.Scanner;

class Rotate1DArray {

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt(); // length of array
    int m = s.nextInt(); // number of rotations
    int [] arr = new int[n];

    for(int i=0; i<arr.length; i++){
      arr[i] = s.nextInt();
    }
    s.close();
    rotate(arr, m);

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }

  }

  public static void rotate(int[] arr, int r){
    r = r % arr.length;
    //rotate the first half
    reverse(arr, 0, arr.length -1 -r);
    //rotate the second half
    reverse(arr, arr.length -r, arr.length -1);
    //rotate the whole array
    reverse(arr, 0, arr.length-1);
  }

  public static void reverse(int[] arr, int li, int ri){
    for(; li<ri; li++,ri--){
      int temp = arr[li];
      arr[li] = arr[ri];
      arr[ri] = temp;
    }
  }
}