package easy;
/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubStringWithoutRepeat {
	
	public int lengthOfLongestSubString(String s) {
		for(int i = 0 ; i < s.length();i++) {
			char ch = s.charAt(i);
			
			
		}
		return 0;
	}
	public static void main(String[] args) {
		directAccessTable("RAHULSAH");
	}
	
	public static void directAccessTable(String s) {
		int[] chars = new int[128];
		
		for(int i = 0 ; i < s.length();i++) {
			char c = s.charAt(i);
			chars[c]++;
		}
		
		for(int val : chars) {
			System.out.print(val + " ");
		}
		
		//System.out.println(chars);
	}
	
	
}
