package easy;

public class GetSquareRoot {
	public static void main(String[] args) {
		int value = getValue(12);
		System.out.println(value);
	}
	
	public static int getValue(int number) {
		if(number == 0 || number ==  1) {
			return number;
		}
		// Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
		int i = 1;
		int result = 1;
		
		while(result <= number) {
			i++;
			result = i * i;
		}
		return i - 1;
	}
}
