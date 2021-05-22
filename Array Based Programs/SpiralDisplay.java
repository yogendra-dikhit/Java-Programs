import java.util.Scanner;

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Sample Input :
3
5
// // // // // // //
// 11 12 13 14 15 //
// 21 22 23 24 25 //
// 31 32 33 34 35 //
// // // // // // //
Sample Output :
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/
public class SpiralDisplay {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int [][] m = new int[r][c];
    int numPrinted = 0;
    int numTotal = r * c;
    for(int i=0; i<m.length; i++){
      for(int j=0; j<m[0].length; j++){
        m[i][j] = s.nextInt();
      }
    }
    s.close();
    int minRow = 0, minCol=0, maxRow = r -1, maxCol = c-1;
    while(numPrinted < numTotal){
      //left wall
      for(int i=minRow,j=minCol; i<=maxRow && numPrinted < numTotal; i++){
        System.out.println(m[i][j]);
        numPrinted++;
      }
      minCol++;

      //bottom wall
      for(int i=maxRow,j=minCol; j<=maxCol && numPrinted < numTotal; j++){
        System.out.println(m[i][j]);
        numPrinted++;
      }
      maxRow--;

      //right wall
      for(int i=maxRow,j=maxCol; i>=minRow && numPrinted < numTotal; i--){
        System.out.println(m[i][j]);
        numPrinted++;
      }
      maxCol--;

      //top wall
      for(int i=minRow,j=maxCol; j>=minCol && numPrinted < numTotal; j--){
        System.out.println(m[i][j]);
        numPrinted++;
      }
      minRow++;
    }
  }

}
