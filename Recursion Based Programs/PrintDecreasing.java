import java.util.Scanner;
/*
1. You are given a positive number n.
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
*/
class PrintDecreasing {

  public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(--n);
    }
}