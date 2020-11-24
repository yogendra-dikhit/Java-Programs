
public class PrimeNumber {
    public static void checkPrimeNumber(int num) {
		int count= 0;
		
		for(int i=2; i<num/2; i++) {
			if( num % i == 0) {
				count++;
				break;
			}
		}
		if(  count == 0 ) {
			System.out.println(num +  " is a Prime Number");
		}else {
			System.out.println(num + " is not a Prime Number ");
		}
	}
	
}
