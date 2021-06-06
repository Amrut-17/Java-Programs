class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int left =0;
        int right = n;
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                arr[i] = nums[left++];
            }else{
                arr[i] = nums[right++];
            }
        }
        return arr;
    }
}
