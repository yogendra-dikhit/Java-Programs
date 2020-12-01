 
/*
You are given an integer array nums sorted in ascending order, and an integer target.
Suppose that nums is rotated at some pivot unknown to you beforehand 
(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
If target is found in the array return its index, otherwise, return -1.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 
Constraints:

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
All values of nums are unique.
nums is guranteed to be rotated at some pivot.
-10^4 <= target <= 10^4
 */
public class SearchinRotatedSortedArray {
	public static int search(int[] nums, int target) {
		if(nums.length == 0) return -1;
		int start=0, end=nums.length-1;
		while(start <= end) {
			int mid = (start +end)/2;
			if(target == nums[mid]) {
				return mid;
			}
			if(nums[start] <= nums[mid]) {
				if(target >= nums[start] && target < nums[mid]) {
					end = mid -1;
				}else
					start = mid +1;
			}
			if(nums[mid] <= nums[end]) {
				if(target <= nums[end] && target > nums[mid]) {
					start = mid +1;
				}else {
					end = mid -1;
				}
			}
		}
        return -1;
    }

	public static void main(String [] args) {
		System.out.println(search(new int[] {4,5,6,7,0,1,2},0));
	}
}
