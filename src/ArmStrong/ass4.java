package ArmStrong;

public class ass4 {
	public static int checkarmstrong(int a) {
		int rem, sum=0;
		while(a>0) {
		rem=a%10;
		sum=sum+rem*rem*rem;
		a=a/10;
		}		
		return sum;
	}
}
