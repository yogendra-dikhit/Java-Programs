

public class ArmstrongNumber {
    public static void checkArmstrongNumber(int num) {
	    int digitCount = 0, temp=0,rem=0, tempCount=0,Result =0, mul=1;

	    temp =num;
	    while ( temp != 0 )
	    {
	        temp = temp/10;
	        digitCount++;
	    }
	    
	    temp = num;
	    tempCount = digitCount;
	    while( temp != 0) {
	    	
	        rem = temp % 10;
	        while ( tempCount != 0 )
	        {
	            mul = mul * rem;
	            tempCount--;
	        }

	        Result = Result + mul;
	        mul = 1; 	
	        tempCount = digitCount;
	        temp = temp / 10;
	    }
	    
	    if ( num == Result )
	        System.out.println(num + " is an Armstrong Number ");

	    else
	    	System.out.println(num + " is not an Armstrong Number ");
	    
	}

}
