public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        while ( low <= high ) {
            int mid = (low + high )/2;
            if ( target > nums[mid]) {
                low = mid + 1;
            }else if ( target < nums[mid]) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return low;
    }
}
