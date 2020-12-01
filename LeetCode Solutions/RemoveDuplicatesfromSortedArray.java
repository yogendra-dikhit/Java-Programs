 
/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer but your answer is an array?
Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:
// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
} 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplicatesfromSortedArray {
	//works but time complexity is much greater
/*
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int duplicates =0;
		for(int i=0; i<nums.length-1-duplicates; i++) {
			int temp = nums[i];
			if(temp == nums[i+1]) {
				for(int j=i+1; j<nums.length-1; j++) {
					nums[j] = nums[j+1];
				}
				duplicates++;
				i--;
			} 
		}
        return nums.length - duplicates;
    }
    */
	//below both are excellent solutions
	/*
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0)return nums.length;
		int i=1, j=0;
		for(;i<nums.length;i++) {
			if(nums[j]!=nums[i]) {
				nums[++j] = nums[i];
			}
		}
		return j+1;
	}
	*/
	public static int removeDuplicates(int[] nums) {
	    int i = nums.length > 0 ? 1 : 0;
	    for (int n : nums)
	        if (n > nums[i-1])
	            nums[i++] = n;
	    return i;
	}
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1,1,1}));
	}

}
