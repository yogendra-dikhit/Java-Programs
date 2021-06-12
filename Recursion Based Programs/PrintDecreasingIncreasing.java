import java.util.Scanner;
/*
1. You are given a positive number n.
2. You are required to print the counting from n to 1 and back to n again.
3. You are required to not use any loops. Complete the body of pdi function to achieve it.
*/
public class PrintDecreasingIncreasing {

  public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        pdi(n);
    }

    public static void pdi(int n){
        if(n == 0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}
