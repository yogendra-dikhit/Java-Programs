import java.util.Scanner;
/*
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.
You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
Sample Input :
5
7
11 12 13 14 15 16 17
21 22 23 24 25 26 27
31 32 33 34 35 36 37
41 42 43 44 45 46 47
51 52 53 54 55 56 57
2
3
Sample OutPut :
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
*/
public class RingRotate2DArray {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int row = s.nextInt();
    int col = s.nextInt();

    int [][] matrix = new int[row][col];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        matrix[i][j] = s.nextInt();
      }
    }
    int ringNumber = s.nextInt();
    int rotations = s.nextInt();
    s.close();

    rotateRing(matrix, ringNumber, rotations);
    display(matrix);
  }
  public static void rotateRing(int [][] arr, int ringNumber, int rotations){
    int[] Oned = fillOneDArrayFromRing(arr, ringNumber);
    rotateOneD(Oned, rotations);
    fillRingFrom1DArray(arr, Oned, ringNumber);
  }

  public static int[] fillOneDArrayFromRing(int [][] arr, int ringNumber){
    int minRow = ringNumber-1, minCol = ringNumber-1, maxRow = arr.length-ringNumber, maxCol = arr[0].length-ringNumber;
    int size = 2 * (maxRow - minRow + maxCol - minCol);
    int [] Oned = new int[size];
    int idx = 0;
    for(int i=minRow, j=minCol; i<=maxRow; i++){
      Oned[idx++] = arr[i][j];
    }
    minCol++;
    for(int i=maxRow, j=minCol; j<=maxCol; j++){
      Oned[idx++] = arr[i][j];
    }
    maxRow--;
    for(int i=maxRow, j=maxCol; i>=minRow; i--){
      Oned[idx++] = arr[i][j];
    }
    maxCol--;
    for(int i=minRow, j=maxCol; j>=minCol; j--){
      Oned[idx++] = arr[i][j];
    }
    return Oned;
  }

  public static void fillRingFrom1DArray(int [][] arr,int [] Oned, int ringNumber){
    int minRow = ringNumber-1, minCol = ringNumber-1, maxRow = arr.length-ringNumber, maxCol = arr[0].length-ringNumber;
    int idx = 0;
    for(int i=minRow, j=minCol; i<=maxRow; i++){
      arr[i][j] = Oned[idx++] ;
    }
    minCol++;
    for(int i=maxRow, j=minCol; j<=maxCol; j++){
      arr[i][j] = Oned[idx++] ;
    }
    maxRow--;
    for(int i=maxRow, j=maxCol; i>=minRow; i--){
      arr[i][j] = Oned[idx++] ;
    }
    maxCol--;
    for(int i=minRow, j=maxCol; j>=minCol; j--){
      arr[i][j] = Oned[idx++] ;
    }
  }

  public static void rotateOneD(int [] arr, int rotations){
    rotations = rotations % arr.length;
    if(rotations < 0){
      rotations += arr.length;
    }
    reverse(arr, 0, arr.length -1 - rotations);
    reverse(arr, arr.length - rotations , arr.length-1);
    reverse(arr, 0, arr.length -1);
  }

  public static void reverse(int[] arr, int li, int ri){
    for(; li<ri; li++,ri--){
      int temp = arr[li];
      arr[li] = arr[ri];
      arr[ri] = temp;
    }
  }

  public static void display(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
  }

}
