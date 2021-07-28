package easy;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubStringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
		int res = 0;
		int strLength = s.length();

		for (int i = 0; i < strLength; i++) {
			//Enumerate all the substrings
			for (int j = i; j < strLength; j++) {
				if (check(s, i, j)) {
					//check for the substring and update the result
					res = Math.max(res, (j - i + 1));
				}
			}
		}
		return res;
	}

	public static boolean check(String s, int start, int end) {
		boolean result = true;
		// we use direct access table
		int[] chars = new int[128];
		//Declare a direct access table to record the occurrence of each characters
		for (int i = start; i <= end; i++) {
			char ch = s.charAt(i);
			chars[ch]++;
			if (chars[ch] > 1)
				result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		int result1 = lengthOfLongestSubstring("abcabcbb");
		int result2 = lengthOfLongestSubstring("bbbbb");
		int result3 = lengthOfLongestSubstring("pwwkew");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
