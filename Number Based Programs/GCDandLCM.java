
public class GCDandLCM {

	public static void findGCDandLCM(int a, int b) {
		if (a == 0 || b == 0) return;
		int oA =a;
		int oB =b;
		if( b > a) {
			int temp = a; a = b; b = temp;
		}
		
		while(a%b != 0) {
			int rem =a%b;
			a = b;
			b = rem;
		}
		
		int lcm = (oA * oB)/ b;
		System.out.println(b+"\n"+ lcm);
	}
	public static void main(String[] args) {
		findGCDandLCM(36,24);
	}
}
