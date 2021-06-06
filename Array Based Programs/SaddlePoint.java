import java.util.Scanner;
/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Sample Input :
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output :
41
*/
public class SaddlePoint {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[][] = new int[n][n];

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            a[i][j] = s.nextInt();
        }
    }
    s.close();
    for(int i=0; i<n; i++){
        int smallestCol = 0;

        for(int j=1; j<n; j++){
            if(a[i][j] < a[i][smallestCol])
                smallestCol = j;
        }

        boolean flag = true;
        for(int k=0; k<n; k++){
            if(a[i][smallestCol] < a[k][smallestCol]){
                flag = false; break;
            }
        }
        if(flag){
            System.out.println(a[i][smallestCol]);
            return;
        }
    }
    System.out.println("Invalid input");
}
}
