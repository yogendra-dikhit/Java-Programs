import java.util.Scanner;
/*
1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
3. You are required to
    3.1. Print the instructions to move the disks.
    3.2. from tower 1 to tower 2 using tower 3
    3.3. following the rules
        3.3.1 move 1 disk at a time.
        3.3.2 never place a smaller disk under a larger disk.
        3.3.3 you can only move a disk at the top.
Sample Input:
3
10
11
12
Sample Output
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]
*/
class TowerOfHanoi {

	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int t1id= s.nextInt();
        int t2id= s.nextInt();
        int t3id= s.nextInt();
        s.close();
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0)
            return;
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+ t1id+" -> "+t2id+"]");
        toh(n-1,t3id,t2id,t1id);
    }
}