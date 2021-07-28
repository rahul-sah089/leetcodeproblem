/*
 * https://leetcode.com/problems/merge-sorted-array/solution/
 */
package easy;

import java.util.Arrays;

public class MergeSortedArray {
	//Naive Approach , Write values from nums2 to nums1, then sort it
	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		for(int i = 0 ; i < n ;i++) {
			nums1[m+i] = nums2[i];
		}
		Arrays.sort(nums1);
	}
	/*
	 * Time complexity : O((n + m)log(n + m))
	 * 
	 * The cost of sorting a list of length x using a built-in sorting algorithm O(xlog x). 
	 * Because in this case we're sorting a list of length m + n, 
	 * we get a total time complexity of O((n + m)log (n + m))
	 * 
	 * 
	 */
	
	public static void merge2(int[] nums1,int m , int[] nums2, int n) {
		
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		//merge(nums1, m, nums2, n);
	}
}
