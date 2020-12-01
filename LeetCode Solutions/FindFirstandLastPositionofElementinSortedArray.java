
public class FindFirstandLastPositionofElementinSortedArray {

	public static int[] searchRange(int[] nums, int target) {
		int result[] = new int[2];
		result[0] = findTarget(nums,target,true);
		result[1] = findTarget(nums,target,false);
		return result;
	}
	private static int findTarget(int[] nums, int target, boolean isFirst) {
		int result = -1, low = 0, high = nums.length-1;
		while(low <= high) {
			int mid = low + (int) Math.ceil((high - low)/2);
			if(nums[mid] < target) {
				low = mid +1;
			}else if(nums[mid] > target){
				high = mid -1;
			}else {
				result = mid;
				if(isFirst)
					high = mid -1;
				else
					low = mid +1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(searchRange(new int[] {5,7,7,8,8,10},8)[1]);
	}

}
