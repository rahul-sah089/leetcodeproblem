package easy;

//Given a string check whether it has duplicate character or not
public class CheckStringHasDuplicateCharacters {

	public static boolean check(String s, int start, int end) {
		int[] chars = new int[128];

		for (int i = start; i <= end; i++) {
			char ch = s.charAt(i);
			chars[ch]++;
			if (chars[ch] > 1) {
				return false;
			}
		}
		return true;
	}

	public int lengthOflongestString(String s) {
		int n = s.length();
		int res = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (check(s, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		boolean hasDuplicate = false;
		String value = "RAHULSAH";
		int[] chars = new int[128];

		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			chars[ch]++;
			if (chars[ch] > 1) {
				System.out.println("It has duplicate");
				hasDuplicate = true;
				break;
			}
		}
		System.out.println("Is unique >>" + !hasDuplicate);
	}
}
