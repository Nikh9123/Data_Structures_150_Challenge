class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        int tWater = 0;

        while (left < right) {
            if (maxLeft < maxRight) {
                left++; // ✅ move first, then calculate
                maxLeft = Math.max(maxLeft, height[left]);
                tWater += (maxLeft - height[left]); // ✅ water = leftMax - current height
            } else {
                right--; // ✅ move first, then calculate
                maxRight = Math.max(maxRight, height[right]);
                tWater += (maxRight - height[right]); // ✅ water = rightMax - current height
            }
        }
        return tWater;
    }
}
