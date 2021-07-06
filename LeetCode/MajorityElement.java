class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int elem : nums){
            if(count == 0){
                element = elem;
            }
            if(elem == element){
                count += 1;
            }else{
                count -= 1;
            }
        }
        return element;
    }
}
