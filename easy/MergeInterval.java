package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeInterval {
	 public int[][] merge(int[][] intervals) {
		 if(intervals.length <= 1) {
			 return intervals;
		 }
		 
		 Arrays.sort(intervals,(arr1,arr2)-> Integer.compare(arr1[0], arr2[0]));
		 
		 List<int[]> output_arr = new ArrayList<>();
		 
		 int[] current_interval = intervals[0];
		 
		 
		 
		 
		 return output_arr.toArray(new int[output_arr.size()][]);
		 
		 
	 }
}
