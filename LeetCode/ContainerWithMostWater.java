// MY APPROACH --> TWO POINTERS
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int min = 0;
        while(left <= right){
            min = Math.min(height[left], height[right]);
            int ans = min*(right-left);
            if(ans > max){
                max = ans;
            }
            if(height[left] <= height[right]){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return max;
    }
}


//  MORE CONCISE SOLUTION
// public int maxArea(int[] height) {
//     int left = 0, right = height.length - 1;
// 	int maxArea = 0;

// 	while (left < right) {
// 		maxArea = Math.max(maxArea, Math.min(height[left], height[right])
// 				* (right - left));
// 		if (height[left] < height[right])
// 			left++;
// 		else
// 			right--;
// 	}

// 	return maxArea;
// }
