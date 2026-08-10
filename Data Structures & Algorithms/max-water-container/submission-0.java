class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxLeft = heights[left], maxRight = heights[right];
        int maxArea = 0;

        while (left < right) {

            maxLeft = heights[left];
            maxRight = heights[right];

            int area = Math.min(maxLeft, maxRight) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}