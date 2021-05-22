import java.util.Scanner;
/*
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".

Sample Input :
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
*/
public class MatrixMultiplication {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int r1 = s.nextInt();
    int c1 = s.nextInt();
    int [][] m1 = new int[r1][c1];
    for(int i=0; i< m1.length; i++){
      for(int j=0; j<m1[0].length; j++){
        m1[i][j] = s.nextInt();
      }
    }

    int r2 = s.nextInt();
    int c2 = s.nextInt();
    int [][] m2 = new int[r2][c2];
    for(int i=0; i< m2.length; i++){
      for(int j=0; j<m2[0].length; j++){
        m2[i][j] = s.nextInt();
      }
    }

    s.close();
    if( c1 != r2 ){
      System.out.println("Invalid input");
      return;
    }

    int [][] m3 = new int[r1][c2];
    for(int i=0; i< m3.length; i++){
      for(int j=0; j<m3[0].length; j++){
        for(int k=0; k<c1; k++){
          m3[i][j] += m1[i][k] * m2[k][j];
        }
      }
    }

    for(int i=0; i< m3.length; i++){
      for(int j=0; j<m3[0].length; j++){
        System.out.print(m3[i][j]+" ");
      }
      System.out.println();
    }
  }

}
