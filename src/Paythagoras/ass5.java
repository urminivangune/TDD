package Paythagoras;

public class ass5 {
public static Boolean checktriplet(int i, int j, int k) {
		
		int I=i*i,J=j*j,K=k*k;
		if(I==J+K || J==I+K || K==I+J) {
			return true;
		}
		else
			return false;
	}
}
