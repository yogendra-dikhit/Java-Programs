import java.util.Scanner;
/*
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".
Sample Input :
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
43
Sample Output :
3
2
*/
public class SearchInSorted2DArray {

  public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[][] m = new int[n][n];

      for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
              m[i][j] = s.nextInt();
          }
      }

      int num = s.nextInt();
      s.close();

      int i=0, j=n-1;

      // Both the solutions below work
      while(i <= n && j >=0 ){
          if(num == m[i][j]){
              System.out.println(i);
              System.out.println(j);
              return;
          }else if(num < m[i][j]){
              j--;
          }else{
              i++;
          }
      }
      System.out.println("Not Found");

      /*
      int i=-1,j=-1;
      boolean found = false;

      for(i=0; i<n && !found; i++){
          if( num >= m[i][0] && num <= m[i][n-1]){
              for(j=0; j<n; j++){
                  if(m[i][j] == num){
                      found = true;
                      break;
                  }
              }
          }
      }
      if(found){
          System.out.println(--i);
          System.out.println(j);
      }else
          System.out.println("Not Found");
      */
  }
}