import java.util.Scanner;
/*
1. You are given a string.
2. You have to print all permutations of the given string iteratively.
Sample Input
abc
Sample Output
abc
bac
cab
acb
bca
cba
*/
public class StringPermutations {

  public static void solution(String str) {
    int n = factorial(str.length());
    for (int i = 0; i < n; i++) {
      StringBuilder s = new StringBuilder(str);
      int dvd = i;
      for (int div = str.length(); div >= 1; div--) {
        int q = dvd / div;
        int r = dvd % div;
        dvd = q;
        System.out.print(s.charAt(r));
        s.deleteCharAt(r);
      }
      System.out.println();
    }
  }
  public static int factorial(int n) {
    int res = 1;
    for (int i = 2; i <= n; i++) {
      res *= i;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
    scn.close();
  }

}
