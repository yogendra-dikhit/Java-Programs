import java.util.Scanner;
/*
1. You are given a number n.
2. You are required to calculate the factorial of the number.
*/
public class Factorial {

  public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        s.close();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 1)
            return n;
        return factorial(n-1) * n;
    }

}
