package easy;
/*
 * https://leetcode.com/problems/excel-sheet-column-number/
 * 
 */
public class ExcelSheetNumber {
	public static int titleToNumber(String columnTitle) {
		//Single digit 
		//A = [(length-1) * 26] + (66 - ascii(last character))
		//Double Digit
		//A = [(length -1) * 26] + (66 - ascii (last character))
						
		//Third Digit
		// A = [(length - 1) * 26] + (66 - ascii( lsat character))
		int result = ((columnTitle.length() - 1) * 26) + ((int)(columnTitle.charAt(columnTitle.length() - 1)))  - 64;		
		return result;
				
	}
	
	public static void main(String[] args) {
		String s = "AAA";
		System.out.println(titleToNumber(s));
	}
}
