import java.util.Scanner;
/*
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*
Sample Input :
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output :
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
*/
public class RotateBy90Degree {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] matrix = new int[n][n];

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            matrix[i][j] = s.nextInt();
        }
    }
    s.close();
    // transpose of matrix
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            int temp = matrix[j][i];
            matrix[j][i] = matrix[i][j];
            matrix[i][j] = temp;
        }
    }

    // swap columns
    for(int i=0; i<n; i++){
        for(int j=0, k= n-1; j< n/2; j++, k--){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][k];
            matrix[i][k] = temp;
        }
    }

    display(matrix);
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
