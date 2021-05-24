class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] arr = new int[nums.length];
        int i = nums.length-1;
        while(left <= right){
            if(Math.abs(nums[left]) >= Math.abs(nums[right])){
                arr[i--] = nums[left]*nums[left];
                left += 1;
            }else{
                arr[i--] = nums[right]*nums[right];
                right -= 1;
            }
        }
        return arr;
    }
}


 //TWO POINTERS APPROACH  
