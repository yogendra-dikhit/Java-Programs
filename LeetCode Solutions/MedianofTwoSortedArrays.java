 

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
Follow up: The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 */
public class MedianofTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int num1Index = 0;
        int num2Index = 0;
        int sum = (nums1.length+nums2.length);
        int medianIndex = sum/2 + 1;
        double preVal = 0;
        double val = 0;
        for (int i=0; i< medianIndex;i++) {
            preVal = val;
            if (num1Index>= nums1.length) {
                val = nums2[num2Index];
                num2Index ++;
            } else if (num2Index>= nums2.length) {
                val = nums1[num1Index];
                num1Index ++;
            } else if (nums1[num1Index]<nums2[num2Index]) {
                val = nums1[num1Index];
                num1Index ++;
            } else {
                val = nums2[num2Index];
                num2Index ++;
            }
        }
        if (sum%2 == 0) {
            val = (preVal + val)/2;
        }
        return val;
    }
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,1},new int[] {1,2}));
	}

}
