//42 . trapped water 

class DayThree {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;

        int water = 0;

        while (start < end) {
            leftMax = Math.max(height[start], leftMax);
            rightMax = Math.max(height[end], rightMax);

            if (leftMax < rightMax) {
                water += leftMax - height[start];
                start++;
            } else {
                water += rightMax - height[end];
                end--;
            }

        }
        return water;
    }
}