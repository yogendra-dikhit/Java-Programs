import java.util.Scanner;
/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.
Note -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.
Sample Input
2
5
Sample Output
32
*/
public class PowerLogarithmic {

	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int n= s.nextInt();
        s.close();
        System.out.println(power(x,n));
  }

	public static int power(int x, int n){
			if(n == 0)
					return 1;
			int firstHalf = power(x,n/2);
			if(n % 2 == 0){
					return firstHalf * firstHalf;
			}
			return firstHalf * firstHalf * x;
	}
}
