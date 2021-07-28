package easy;

/*
 * SubArray : An Array within an array containing contiguous element
 * inputArray = [-2,2,5,-11,6];
 * [-2,2,5,-11,6] -> 0
 * [2] -> 2
 * [5,-11] -> -6
 * Result -> [2,5] -> 7
*/
public class LargestSumContigousSubArray {
	public static void main(String[] args) {
		int[] inputArray = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSubArray = maxSubArray(inputArray);
		System.out.println(maxSubArray);
	}

	// Brute Force
	public static int maxSubArray(int[] inputArray) {
		int maxSubarray = Integer.MIN_VALUE;
		for (int i = 0; i < inputArray.length; i++) {
			int currentSubArray = 0;
			for (int j = i; j < inputArray.length; j++) {
				currentSubArray += inputArray[j];
				maxSubarray = Math.max(maxSubarray, currentSubArray);
			}
		}
		return maxSubarray;
	}
}
