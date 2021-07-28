package easy;

public class PalindromeCheck {
	public static void main(String[] args) {
		System.out.println(isPalindrome1(121));
		System.out.println(isPalindrome1(123));
		System.out.println(isPalindrome1(-121));
		//System.out.println(isPalindrome2(121));
		//System.out.println(isPalindrome2(123));
		//System.out.println(isPalindrome2(-121));
	}
	
	public static boolean isPalindrome1(int x) {
		int originalNumber = x;
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int revertedNumber = 0 ;
		while(x != 0) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x = x /10;
		}
		return originalNumber == revertedNumber;
	}
	
	public static boolean isPalindrome2(int x) {
		boolean isPalindrome = true;
		String val = String.valueOf(x);
		if(x < 0) {
			return false;
		}else {
			for(int i = 0 ; i < val.length();i++) {
				if(val.charAt(i) != val.charAt(val.length() - i - 1)) {
					isPalindrome = false;
				}
			}
		}
		return isPalindrome;
	}
}
