class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum is on the right
                low = mid + 1;
            } else {
                // mid could itself be the minimum
                high = mid;
            }
        }

        return nums[low];
    }
}