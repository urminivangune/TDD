package palindrome;
import java.util.*;
public class as2 {
	public static boolean checkPalindrome(String str1, String str2) {
		char[] arr = str1.toCharArray();
		int len = arr.length;
		char[] revarray = new char[len];
		String revstring;

		for (int i = len - 1, j = 0; i >= 0; i--, j++) {
			revarray[j] = arr[i];
		}

		revstring = String.valueOf(revarray);

		if (str2.equals(revstring) && str1.equals(revstring)) {
			return true;
		} else

			return false;

	}
	
	}
	

